// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package roo.nw.model;

import io.springlets.format.EntityFormat;
import javax.persistence.Entity;
import javax.persistence.Table;
import roo.nw.model.Region;

privileged aspect Region_Roo_Jpa_Entity {
    
    declare @type: Region: @Entity;
    
    declare @type: Region: @Table(name = "NW_REGIONS");
    
    declare @type: Region: @EntityFormat;
    
}