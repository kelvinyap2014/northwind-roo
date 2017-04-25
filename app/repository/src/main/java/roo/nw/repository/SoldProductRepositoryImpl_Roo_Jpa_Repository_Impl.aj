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
import roo.nw.model.QSoldProduct;
import roo.nw.model.SoldProduct;
import roo.nw.repository.SoldProductRepositoryCustom;
import roo.nw.repository.SoldProductRepositoryImpl;

privileged aspect SoldProductRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare parents: SoldProductRepositoryImpl implements SoldProductRepositoryCustom;
    
    declare @type: SoldProductRepositoryImpl: @Transactional(readOnly = true);
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param globalSearch
     * @param pageable
     * @return Page
     */
    public Page<SoldProduct> SoldProductRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        
        QSoldProduct soldProduct = QSoldProduct.soldProduct;
        
        JPQLQuery<SoldProduct> query = from(soldProduct);
        
        Path<?>[] paths = new Path<?>[] {};        
        applyGlobalSearch(globalSearch, query, paths);
        
        AttributeMappingBuilder mapping = buildMapper();
        
        applyPagination(pageable, query, mapping);
        applyOrderById(query);
        
        return loadPage(query, pageable, soldProduct);
    }
    
}