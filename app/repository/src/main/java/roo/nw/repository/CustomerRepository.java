package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import roo.nw.model.Customer;
import roo.nw.model.CustomerInfo;

/**
 * = CustomerRepository
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Customer.class, defaultReturnType = CustomerInfo.class)
public interface CustomerRepository {
}
