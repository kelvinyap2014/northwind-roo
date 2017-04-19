package roo.nw.application.web;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;
import roo.nw.model.City;

/**
 * = CitiesCollectionJsonController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = City.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class CitiesCollectionJsonController {
}
