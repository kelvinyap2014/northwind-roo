package roo.nw.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import roo.nw.model.OrderDetail;

/**
 * = OrderDetailRepositoryImpl
 *
 * TODO Auto-generated class documentation
 *
 */ 
@RooJpaRepositoryCustomImpl(repository = OrderDetailRepositoryCustom.class)
public class OrderDetailRepositoryImpl extends QueryDslRepositorySupportExt<OrderDetail> {

    /**
     * TODO Auto-generated constructor documentation
     */
    OrderDetailRepositoryImpl() {
        super(OrderDetail.class);
    }
}