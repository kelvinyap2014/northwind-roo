package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import roo.nw.model.dod.CategoryDataOnDemand;
import roo.nw.model.dod.DataOnDemandConfiguration;

/**
 * = CategoryRepositoryIT
 *
 * TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = CategoryRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = CategoryDataOnDemand.class)
public class CategoryRepositoryIT {
}
