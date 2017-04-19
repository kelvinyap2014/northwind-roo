package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import roo.nw.model.City;
import org.springframework.roo.addon.layers.repository.jpa.annotations.finder.RooFinder;

/**
 * = CityRepository
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = City.class, finders = { @RooFinder(value = "findByRegionIdOrderByDescriptionAsc", returnType = City.class) })
public interface CityRepository {
}
