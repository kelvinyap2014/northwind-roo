// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package roo.nw.repository;

import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import io.springlets.data.domain.GlobalSearch;
import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt.AttributeMappingBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import roo.nw.model.City;
import roo.nw.model.Country;
import roo.nw.model.Party;
import roo.nw.model.QParty;
import roo.nw.model.Region;
import roo.nw.repository.PartyRepositoryCustom;
import roo.nw.repository.PartyRepositoryImpl;

privileged aspect PartyRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare parents: PartyRepositoryImpl implements PartyRepositoryCustom;
    
    declare @type: PartyRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PartyRepositoryImpl.CITY = "city";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PartyRepositoryImpl.COUNTRY = "country";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PartyRepositoryImpl.ADDRESS = "address";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PartyRepositoryImpl.POSTAL_CODE = "postalCode";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PartyRepositoryImpl.PHONE = "phone";
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    public static final String PartyRepositoryImpl.REGION = "region";
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Party> PartyRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QParty party = QParty.party;
        
        JPQLQuery<Party> query = from(party);
        
        Path<?>[] paths = new Path<?>[] {party.city,party.country,party.address,party.postalCode,party.phone,party.region};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(CITY, party.city)
			.map(COUNTRY, party.country)
			.map(ADDRESS, party.address)
			.map(POSTAL_CODE, party.postalCode)
			.map(PHONE, party.phone)
			.map(REGION, party.region);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, party);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param city
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Party> PartyRepositoryImpl.findByCity(City city, GlobalSearch globalSearch, Pageable pageable) {
        
        QParty party = QParty.party;
        
        JPQLQuery<Party> query = from(party);
        
        Assert.notNull(city, "city is required");
        
        query.where(party.city.eq(city));
        Path<?>[] paths = new Path<?>[] {party.city,party.country,party.address,party.postalCode,party.phone,party.region};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(CITY, party.city)
			.map(COUNTRY, party.country)
			.map(ADDRESS, party.address)
			.map(POSTAL_CODE, party.postalCode)
			.map(PHONE, party.phone)
			.map(REGION, party.region);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, party);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param country
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Party> PartyRepositoryImpl.findByCountry(Country country, GlobalSearch globalSearch, Pageable pageable) {
        
        QParty party = QParty.party;
        
        JPQLQuery<Party> query = from(party);
        
        Assert.notNull(country, "country is required");
        
        query.where(party.country.eq(country));
        Path<?>[] paths = new Path<?>[] {party.city,party.country,party.address,party.postalCode,party.phone,party.region};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(CITY, party.city)
			.map(COUNTRY, party.country)
			.map(ADDRESS, party.address)
			.map(POSTAL_CODE, party.postalCode)
			.map(PHONE, party.phone)
			.map(REGION, party.region);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, party);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param region
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<Party> PartyRepositoryImpl.findByRegion(Region region, GlobalSearch globalSearch, Pageable pageable) {
        
        QParty party = QParty.party;
        
        JPQLQuery<Party> query = from(party);
        
        Assert.notNull(region, "region is required");
        
        query.where(party.region.eq(region));
        Path<?>[] paths = new Path<?>[] {party.city,party.country,party.address,party.postalCode,party.phone,party.region};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper()
			.map(CITY, party.city)
			.map(COUNTRY, party.country)
			.map(ADDRESS, party.address)
			.map(POSTAL_CODE, party.postalCode)
			.map(PHONE, party.phone)
			.map(REGION, party.region);
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, party);
    }
    
}
