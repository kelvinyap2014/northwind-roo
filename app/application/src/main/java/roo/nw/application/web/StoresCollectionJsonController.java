package roo.nw.application.web;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;
import roo.nw.model.Store;

/**
 * = StoresCollectionJsonController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Store.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class StoresCollectionJsonController {
}
