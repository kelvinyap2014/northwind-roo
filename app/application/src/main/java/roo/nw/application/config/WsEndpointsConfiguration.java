package roo.nw.application.config;
import org.springframework.roo.addon.ws.annotations.RooWsEndpoints;
import roo.nw.application.ws.endpoint.CategoryWebServiceEndpoint;

/**
 * = WsEndpointsConfiguration
 *
 * TODO Auto-generated class documentation
 *
 */
@RooWsEndpoints(endpoints = { CategoryWebServiceEndpoint.class })
public class WsEndpointsConfiguration {
}
