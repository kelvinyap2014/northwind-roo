package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import roo.nw.model.dod.CountryDataOnDemand;
import roo.nw.model.dod.DataOnDemandConfiguration;

/**
 * = CountryRepositoryIT
 *
 * TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = CountryRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = CountryDataOnDemand.class)
public class CountryRepositoryIT {
}
