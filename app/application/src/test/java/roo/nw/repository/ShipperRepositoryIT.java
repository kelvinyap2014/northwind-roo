package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import roo.nw.model.dod.DataOnDemandConfiguration;
import roo.nw.model.dod.ShipperDataOnDemand;

/**
 * = ShipperRepositoryIT
 *
 * TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = ShipperRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = ShipperDataOnDemand.class)
public class ShipperRepositoryIT {
}
