package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import roo.nw.model.dod.DataOnDemandConfiguration;
import roo.nw.model.dod.RegionDataOnDemand;

/**
 * = RegionRepositoryIT
 *
 * TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = RegionRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = RegionDataOnDemand.class)
public class RegionRepositoryIT {
}
