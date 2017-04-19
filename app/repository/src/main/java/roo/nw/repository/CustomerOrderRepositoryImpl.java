package roo.nw.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import roo.nw.model.CustomerOrder;

/**
 * = CustomerOrderRepositoryImpl
 *
 * TODO Auto-generated class documentation
 *
 */ 
@RooJpaRepositoryCustomImpl(repository = CustomerOrderRepositoryCustom.class)
public class CustomerOrderRepositoryImpl extends QueryDslRepositorySupportExt<CustomerOrder> {

    /**
     * TODO Auto-generated constructor documentation
     */
    CustomerOrderRepositoryImpl() {
        super(CustomerOrder.class);
    }
}