package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import roo.nw.model.dod.CustomerDataOnDemand;
import roo.nw.model.dod.DataOnDemandConfiguration;

/**
 * = CustomerRepositoryIT
 *
 * TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = CustomerRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = CustomerDataOnDemand.class)
public class CustomerRepositoryIT {
}
