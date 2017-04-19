package roo.nw.application.web;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;
import roo.nw.model.CustomerOrder;

/**
 * = CustomerOrdersCollectionThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = CustomerOrder.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class CustomerOrdersCollectionThymeleafController {
}
