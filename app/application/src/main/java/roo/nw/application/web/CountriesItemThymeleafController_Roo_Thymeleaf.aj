// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package roo.nw.application.web;

import io.springlets.web.NotFoundException;
import io.springlets.web.mvc.util.ControllerMethodLinkBuilderFactory;
import io.springlets.web.mvc.util.MethodLinkBuilderFactory;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import roo.nw.application.web.CountriesItemThymeleafController;
import roo.nw.model.Country;
import roo.nw.service.api.CountryService;

privileged aspect CountriesItemThymeleafController_Roo_Thymeleaf {
    
    declare @type: CountriesItemThymeleafController: @Controller;
    
    declare @type: CountriesItemThymeleafController: @RequestMapping(value = "/countries/{country}", name = "CountriesItemThymeleafController", produces = MediaType.TEXT_HTML_VALUE);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MessageSource CountriesItemThymeleafController.messageSource;
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private MethodLinkBuilderFactory<CountriesItemThymeleafController> CountriesItemThymeleafController.itemLink;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param countryService
     * @param messageSource
     * @param linkBuilder
     */
    @Autowired
    public CountriesItemThymeleafController.new(CountryService countryService, MessageSource messageSource, ControllerMethodLinkBuilderFactory linkBuilder) {
        setCountryService(countryService);
        setMessageSource(messageSource);
        setItemLink(linkBuilder.of(CountriesItemThymeleafController.class));
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @return MessageSource
     */
    public MessageSource CountriesItemThymeleafController.getMessageSource() {
        return messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param messageSource
     */
    public void CountriesItemThymeleafController.setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return MethodLinkBuilderFactory
     */
    public MethodLinkBuilderFactory<CountriesItemThymeleafController> CountriesItemThymeleafController.getItemLink() {
        return itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param itemLink
     */
    public void CountriesItemThymeleafController.setItemLink(MethodLinkBuilderFactory<CountriesItemThymeleafController> itemLink) {
        this.itemLink = itemLink;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @param locale
     * @param method
     * @return Country
     */
    @ModelAttribute
    public Country CountriesItemThymeleafController.getCountry(@PathVariable("country") Long id, Locale locale, HttpMethod method) {
        Country country = countryService.findOne(id);
        if (country == null) {
            String message = messageSource.getMessage("error_NotFound", new Object[] {"Country", id}, "The record couldn't be found", locale);
            throw new NotFoundException(message);
        }
        return country;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param country
     * @param model
     * @return ModelAndView
     */
    @GetMapping(name = "show")
    public ModelAndView CountriesItemThymeleafController.show(@ModelAttribute Country country, Model model) {
        model.addAttribute("country", country);
        return new ModelAndView("countries/show");
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param country
     * @param model
     * @return ModelAndView
     */
    @GetMapping(value = "/inline", name = "showInline")
    public ModelAndView CountriesItemThymeleafController.showInline(@ModelAttribute Country country, Model model) {
        model.addAttribute("country", country);
        return new ModelAndView("countries/showInline :: inline-content");
    }
    
}
