package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import roo.nw.model.dod.CustomerOrderDataOnDemand;
import roo.nw.model.dod.DataOnDemandConfiguration;

/**
 * = CustomerOrderRepositoryIT
 *
 * TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = CustomerOrderRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = CustomerOrderDataOnDemand.class)
public class CustomerOrderRepositoryIT {
}
