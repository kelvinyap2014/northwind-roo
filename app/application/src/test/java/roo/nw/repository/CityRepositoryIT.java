package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import roo.nw.model.dod.CityDataOnDemand;
import roo.nw.model.dod.DataOnDemandConfiguration;

/**
 * = CityRepositoryIT
 *
 * TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = CityRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = CityDataOnDemand.class)
public class CityRepositoryIT {
}
