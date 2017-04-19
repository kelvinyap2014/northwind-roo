package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import roo.nw.model.Region;
import org.springframework.roo.addon.layers.repository.jpa.annotations.finder.RooFinder;

/**
 * = RegionRepository
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Region.class, finders = { @RooFinder(value = "findByCountryIdOrderByDescriptionAsc", returnType = Region.class) })
public interface RegionRepository {
}
