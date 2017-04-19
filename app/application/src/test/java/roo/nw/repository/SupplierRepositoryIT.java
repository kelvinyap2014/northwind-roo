package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import roo.nw.model.dod.DataOnDemandConfiguration;
import roo.nw.model.dod.SupplierDataOnDemand;

/**
 * = SupplierRepositoryIT
 *
 * TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = SupplierRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = SupplierDataOnDemand.class)
public class SupplierRepositoryIT {
}
