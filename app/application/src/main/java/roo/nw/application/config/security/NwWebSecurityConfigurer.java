/*
 * Copyright 2012-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package roo.nw.application.config.security;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.header.writers.StaticHeadersWriter;

import io.springlets.security.web.config.SpringletsSecurityWebAccessDeniedHandlerImpl;
import io.springlets.security.web.config.SpringletsSecurityWebAuthenticationEntryPoint;

/**
 * Adapted from
 * io.springlets.security.web.config.SpringletsWebSecurityConfigurer
 * @author Enrique Ruiz at http://www.disid.com[DISID Corporation S.L.]
 */
@Configuration
@EnableWebSecurity
@Order(99)
public class NwWebSecurityConfigurer extends WebSecurityConfigurerAdapter {

	boolean disableConcurrency = true;
	
	@Value("${security.ignored:#{null}}")
	private List<String> securityIgnored;
	
	private static final Logger LOG = LoggerFactory.getLogger(NwWebSecurityConfigurer.class);

	// Don't make final to allow test cases faking them
	private static String DEFAULT_POLICY_DIRECTIVES = "script-src 'self' 'unsafe-inline' ";

	private static String CONTENT_SECURITY_POLICY_HEADER = "Content-Security-Policy";

	private static String LOGIN_FORM_URL = "/login";

	private static String X_CONTENT_SECURITY_POLICY_HEADER = "X-Content-Security-Policy";

	private static String X_WEBKIT_CSP_POLICY_HEADER = "X-WebKit-CSP";

	/**
	 * {@inheritDoc}
	 * 
	 * Ignore security for paths configured based on 'security.ignored' property.
	 * 
	 * @author Kelvin Yap https://www.linkedin.com/in/kelvin2014/
	 */
	@Override
	public void configure(WebSecurity web) throws Exception {
		LOG.debug("BEGIN configure(WebSecurity)");
		// making /h2-console/** in public zone
		if(null != securityIgnored && !securityIgnored.isEmpty()) {
			web.ignoring().antMatchers(securityIgnored.toArray(new String[0]));
		}
		LOG.debug("END configure(WebSecurity)");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Initializes the default {@link UserDetailsService} causing the
	 * {@link AuthenticationManagerBuilder} creates automatically the
	 * {@link DaoAuthenticationProvider} that delegates on the given
	 * {@link UserDetailsService}.
	 * 
	 * Also setup the {@link BCryptPasswordEncoder} to use with the
	 * {@link DaoAuthenticationProvider}
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		// Session management

		if (disableConcurrency) {
			http.sessionManagement().maximumSessions(1).expiredUrl("/login?expired");
		}

		// CSP settings

		http.headers()
				.addHeaderWriter(new StaticHeadersWriter(X_CONTENT_SECURITY_POLICY_HEADER, DEFAULT_POLICY_DIRECTIVES))
				.addHeaderWriter(new StaticHeadersWriter(CONTENT_SECURITY_POLICY_HEADER, DEFAULT_POLICY_DIRECTIVES))
				.addHeaderWriter(new StaticHeadersWriter(X_WEBKIT_CSP_POLICY_HEADER, DEFAULT_POLICY_DIRECTIVES));

		// Authentication

		http
	      .authorizeRequests()
	        .antMatchers("/public/**", "/webjars/**", "/resources/**", "/static/**", "/login/**").permitAll()
	        .anyRequest().authenticated()
	        .and()
	      .formLogin()
	        .loginPage(LOGIN_FORM_URL)
	        .permitAll()
	        .and()
	      .logout()
	        .permitAll();

		// IMPORTANT: loginPage() will set the URL path to which redirect to
		// identify the user it does NOT create the method that handles the
		// request.

		http.exceptionHandling().authenticationEntryPoint(new SpringletsSecurityWebAuthenticationEntryPoint())
				.accessDeniedHandler(new SpringletsSecurityWebAccessDeniedHandlerImpl());

	}
}
