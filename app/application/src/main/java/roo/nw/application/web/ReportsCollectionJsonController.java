package roo.nw.application.web;
import org.springframework.roo.addon.web.mvc.controller.annotations.ControllerType;
import org.springframework.roo.addon.web.mvc.controller.annotations.RooController;
import org.springframework.roo.addon.web.mvc.controller.annotations.responses.json.RooJSON;
import roo.nw.model.Report;

/**
 * = ReportsCollectionJsonController
 *
 * TODO Auto-generated class documentation
 *
 */
@RooController(entity = Report.class, pathPrefix = "/api", type = ControllerType.COLLECTION)
@RooJSON
public class ReportsCollectionJsonController {
}
