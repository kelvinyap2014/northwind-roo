package roo.nw.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import roo.nw.model.City;

/**
 * = CityRepositoryImpl
 *
 * TODO Auto-generated class documentation
 *
 */ 
@RooJpaRepositoryCustomImpl(repository = CityRepositoryCustom.class)
public class CityRepositoryImpl extends QueryDslRepositorySupportExt<City> {

    /**
     * TODO Auto-generated constructor documentation
     */
    CityRepositoryImpl() {
        super(City.class);
    }
}