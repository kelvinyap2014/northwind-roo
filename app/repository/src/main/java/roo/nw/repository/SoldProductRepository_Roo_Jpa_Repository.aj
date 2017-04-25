// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package roo.nw.repository;

import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.transaction.annotation.Transactional;
import roo.nw.model.SoldProduct;
import roo.nw.repository.SoldProductRepository;
import roo.nw.repository.SoldProductRepositoryCustom;

privileged aspect SoldProductRepository_Roo_Jpa_Repository {
    
    declare parents: SoldProductRepository extends DetachableJpaRepository<SoldProduct, Long>;
    
    declare parents: SoldProductRepository extends SoldProductRepositoryCustom;
    
    declare @type: SoldProductRepository: @Transactional(readOnly = true);
    
}