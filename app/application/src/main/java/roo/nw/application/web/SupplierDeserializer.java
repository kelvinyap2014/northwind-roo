package roo.nw.application.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;
import roo.nw.model.Supplier;
import roo.nw.service.api.SupplierService;

/**
 * = SupplierDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Supplier.class)
public class SupplierDeserializer extends JsonObjectDeserializer<Supplier> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private SupplierService supplierService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param supplierService
     * @param conversionService
     */
    @Autowired
    public SupplierDeserializer(@Lazy SupplierService supplierService, ConversionService conversionService) {
        this.supplierService = supplierService;
        this.conversionService = conversionService;
    }
}
