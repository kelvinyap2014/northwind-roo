package roo.nw.application.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;
import roo.nw.model.CustomerOrder;
import roo.nw.service.api.CustomerOrderService;

/**
 * = CustomerOrderDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = CustomerOrder.class)
public class CustomerOrderDeserializer extends JsonObjectDeserializer<CustomerOrder> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private CustomerOrderService customerOrderService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param customerOrderService
     * @param conversionService
     */
    @Autowired
    public CustomerOrderDeserializer(@Lazy CustomerOrderService customerOrderService, ConversionService conversionService) {
        this.customerOrderService = customerOrderService;
        this.conversionService = conversionService;
    }
}
