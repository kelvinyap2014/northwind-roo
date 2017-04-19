package roo.nw.application.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;
import roo.nw.model.City;
import roo.nw.service.api.CityService;

/**
 * = CityDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = City.class)
public class CityDeserializer extends JsonObjectDeserializer<City> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private CityService cityService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param cityService
     * @param conversionService
     */
    @Autowired
    public CityDeserializer(@Lazy CityService cityService, ConversionService conversionService) {
        this.cityService = cityService;
        this.conversionService = conversionService;
    }
}
