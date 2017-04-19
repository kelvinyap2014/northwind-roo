package roo.nw.application.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;
import roo.nw.model.SoldProduct;
import roo.nw.service.api.SoldProductService;

/**
 * = SoldProductDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = SoldProduct.class)
public class SoldProductDeserializer extends JsonObjectDeserializer<SoldProduct> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private SoldProductService soldProductService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param soldProductService
     * @param conversionService
     */
    @Autowired
    public SoldProductDeserializer(@Lazy SoldProductService soldProductService, ConversionService conversionService) {
        this.soldProductService = soldProductService;
        this.conversionService = conversionService;
    }
}
