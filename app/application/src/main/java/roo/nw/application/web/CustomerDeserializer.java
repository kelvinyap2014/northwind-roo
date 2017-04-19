package roo.nw.application.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;
import roo.nw.model.Customer;
import roo.nw.service.api.CustomerService;

/**
 * = CustomerDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Customer.class)
public class CustomerDeserializer extends JsonObjectDeserializer<Customer> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private CustomerService customerService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param customerService
     * @param conversionService
     */
    @Autowired
    public CustomerDeserializer(@Lazy CustomerService customerService, ConversionService conversionService) {
        this.customerService = customerService;
        this.conversionService = conversionService;
    }
}
