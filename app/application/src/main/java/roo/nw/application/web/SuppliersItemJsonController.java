package roo.nw.application.web;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;
import roo.nw.model.Supplier;

/**
 * = SuppliersItemJsonController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Supplier.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class SuppliersItemJsonController {
}
