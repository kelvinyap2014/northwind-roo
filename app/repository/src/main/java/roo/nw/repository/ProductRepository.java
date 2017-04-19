package roo.nw.repository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import roo.nw.model.Product;
import org.springframework.roo.addon.layers.repository.jpa.annotations.finder.RooFinder;

/**
 * = ProductRepository
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Product.class, finders = { @RooFinder(value = "findByDiscontinuedOrderByNameAsc", returnType = Product.class) })
public interface ProductRepository {
}
