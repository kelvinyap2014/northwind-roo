package roo.nw.application.web;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.thymeleaf.annotations.RooThymeleaf;
import roo.nw.model.City;

/**
 * = CitiesCollectionThymeleafController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = City.class, type = ControllerType.COLLECTION)
@RooThymeleaf
public class CitiesCollectionThymeleafController {
}
