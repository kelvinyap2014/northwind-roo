package roo.nw.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import roo.nw.model.PurchaseOrder;

/**
 * = PurchaseOrderRepositoryImpl
 *
 * TODO Auto-generated class documentation
 *
 */ 
@RooJpaRepositoryCustomImpl(repository = PurchaseOrderRepositoryCustom.class)
public class PurchaseOrderRepositoryImpl extends QueryDslRepositorySupportExt<PurchaseOrder> {

    /**
     * TODO Auto-generated constructor documentation
     */
    PurchaseOrderRepositoryImpl() {
        super(PurchaseOrder.class);
    }
}