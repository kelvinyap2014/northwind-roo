package roo.nw.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import roo.nw.model.Country;

/**
 * = CountryRepositoryImpl
 *
 * TODO Auto-generated class documentation
 *
 */ 
@RooJpaRepositoryCustomImpl(repository = CountryRepositoryCustom.class)
public class CountryRepositoryImpl extends QueryDslRepositorySupportExt<Country> {

    /**
     * TODO Auto-generated constructor documentation
     */
    CountryRepositoryImpl() {
        super(Country.class);
    }
}