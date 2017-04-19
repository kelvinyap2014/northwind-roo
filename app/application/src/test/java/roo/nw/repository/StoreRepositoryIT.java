package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import roo.nw.model.dod.DataOnDemandConfiguration;
import roo.nw.model.dod.StoreDataOnDemand;

/**
 * = StoreRepositoryIT
 *
 * TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = StoreRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = StoreDataOnDemand.class)
public class StoreRepositoryIT {
}
