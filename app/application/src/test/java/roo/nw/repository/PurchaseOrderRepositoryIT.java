package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import roo.nw.model.dod.DataOnDemandConfiguration;
import roo.nw.model.dod.PurchaseOrderDataOnDemand;

/**
 * = PurchaseOrderRepositoryIT
 *
 * TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = PurchaseOrderRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = PurchaseOrderDataOnDemand.class)
public class PurchaseOrderRepositoryIT {
}
