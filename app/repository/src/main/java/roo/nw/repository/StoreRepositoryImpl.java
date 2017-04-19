package roo.nw.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import roo.nw.model.Store;

/**
 * = StoreRepositoryImpl
 *
 * TODO Auto-generated class documentation
 *
 */ 
@RooJpaRepositoryCustomImpl(repository = StoreRepositoryCustom.class)
public class StoreRepositoryImpl extends QueryDslRepositorySupportExt<Store> {

    /**
     * TODO Auto-generated constructor documentation
     */
    StoreRepositoryImpl() {
        super(Store.class);
    }
}