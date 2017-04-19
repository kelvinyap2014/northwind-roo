package roo.nw.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import roo.nw.model.Party;

/**
 * = PartyRepositoryImpl
 *
 * TODO Auto-generated class documentation
 *
 */ 
@RooJpaRepositoryCustomImpl(repository = PartyRepositoryCustom.class)
public class PartyRepositoryImpl extends QueryDslRepositorySupportExt<Party> {

    /**
     * TODO Auto-generated constructor documentation
     */
    PartyRepositoryImpl() {
        super(Party.class);
    }
}