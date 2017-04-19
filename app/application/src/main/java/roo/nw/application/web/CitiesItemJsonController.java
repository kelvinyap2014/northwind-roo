package roo.nw.application.web;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;
import roo.nw.model.City;

/**
 * = CitiesItemJsonController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = City.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class CitiesItemJsonController {
}
