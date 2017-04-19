package roo.nw.application.web;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;
import roo.nw.model.Supplier;

/**
 * = SuppliersItemThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Supplier.class, type = ControllerType.ITEM)
@RooThymeleaf
public class SuppliersItemThymeleafController {
}
