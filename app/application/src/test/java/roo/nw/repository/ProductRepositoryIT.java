package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import roo.nw.model.dod.DataOnDemandConfiguration;
import roo.nw.model.dod.ProductDataOnDemand;

/**
 * = ProductRepositoryIT
 *
 * TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = ProductRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = ProductDataOnDemand.class)
public class ProductRepositoryIT {
}
