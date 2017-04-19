package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import roo.nw.model.dod.DataOnDemandConfiguration;
import roo.nw.model.dod.OrderDetailDataOnDemand;

/**
 * = OrderDetailRepositoryIT
 *
 * TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = OrderDetailRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = OrderDetailDataOnDemand.class)
public class OrderDetailRepositoryIT {
}
