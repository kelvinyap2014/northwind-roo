package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.test.RooRepositoryJpaIntegrationTest;
import roo.nw.model.dod.DataOnDemandConfiguration;
import roo.nw.model.dod.ReportDataOnDemand;

/**
 * = ReportRepositoryIT
 *
 * TODO Auto-generated class documentation
 *
 */
@RooRepositoryJpaIntegrationTest(targetClass = ReportRepository.class, dodConfigurationClass = DataOnDemandConfiguration.class, dodClass = ReportDataOnDemand.class)
public class ReportRepositoryIT {
}
