package roo.nw.service.api;
import org.springframework.roo.addon.layers.service.annotations.RooService;
import roo.nw.model.Customer;
import org.springframework.roo.addon.security.annotations.RooSecurityAuthorization;
import org.springframework.roo.addon.security.annotations.RooSecurityAuthorizations;

/**
 * = CustomerService
 *
 * TODO Auto-generated class documentation
 *
 */
@RooService(entity = Customer.class)
@RooSecurityAuthorizations(authorizations = { @RooSecurityAuthorization(method = "delete", parameters = { Customer.class }, roles = "ADMIN,EMPLEADO"), @RooSecurityAuthorization(method = "delete", parameters = { Iterable.class }, roles = "ADMIN,EMPLEADO") })
public interface CustomerService {
}
