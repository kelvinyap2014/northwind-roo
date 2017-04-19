package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import roo.nw.model.dod.DataOnDemandConfiguration;
import roo.nw.model.dod.SoldProductDataOnDemand;

/**
 * = SoldProductRepositoryIT
 *
 * TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = SoldProductRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = SoldProductDataOnDemand.class)
public class SoldProductRepositoryIT {
}
