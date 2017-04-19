package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import roo.nw.model.dod.DataOnDemandConfiguration;
import roo.nw.model.dod.PartyDataOnDemand;

/**
 * = PartyRepositoryIT
 *
 * TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = PartyRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = PartyDataOnDemand.class)
public class PartyRepositoryIT {
}
