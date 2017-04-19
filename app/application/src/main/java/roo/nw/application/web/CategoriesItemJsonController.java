package roo.nw.application.web;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;
import roo.nw.model.Category;

/**
 * = CategoriesItemJsonController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Category.class, pathPrefix = "/api", type = ControllerType.ITEM)
@RooJSON
public class CategoriesItemJsonController {
}
