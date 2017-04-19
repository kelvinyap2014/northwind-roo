package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import roo.nw.model.dod.DataOnDemandConfiguration;
import roo.nw.model.dod.EmployeeDataOnDemand;

/**
 * = EmployeeRepositoryIT
 *
 * TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = EmployeeRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = EmployeeDataOnDemand.class)
public class EmployeeRepositoryIT {
}
