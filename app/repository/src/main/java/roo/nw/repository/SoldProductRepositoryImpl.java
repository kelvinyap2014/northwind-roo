package roo.nw.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import roo.nw.model.SoldProduct;

/**
 * = SoldProductRepositoryImpl
 *
 * TODO Auto-generated class documentation
 *
 */ 
@RooJpaRepositoryCustomImpl(repository = SoldProductRepositoryCustom.class)
public class SoldProductRepositoryImpl extends QueryDslRepositorySupportExt<SoldProduct> {

    /**
     * TODO Auto-generated constructor documentation
     */
    SoldProductRepositoryImpl() {
        super(SoldProduct.class);
    }
}