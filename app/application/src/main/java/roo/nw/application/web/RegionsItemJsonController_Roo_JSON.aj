// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package roo.nw.application.web;

import io.springlets.web.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;
import org.springframework.web.util.UriComponents;
import roo.nw.application.web.RegionsItemJsonController;
import roo.nw.model.Region;
import roo.nw.service.api.RegionService;

privileged aspect RegionsItemJsonController_Roo_JSON {
    
    declare @type: RegionsItemJsonController: @RestController;
    
    declare @type: RegionsItemJsonController: @RequestMapping(value = "/api/regions/{region}", name = "RegionsItemJsonController", produces = MediaType.APPLICATION_JSON_VALUE);
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     * @param regionService
     */
    @Autowired
    public RegionsItemJsonController.new(RegionService regionService) {
        this.regionService = regionService;
    }

    /**
     * TODO Auto-generated method documentation
     * 
     * @param id
     * @return Region
     */
    @ModelAttribute
    public Region RegionsItemJsonController.getRegion(@PathVariable("region") Long id) {
        Region region = regionService.findOne(id);
        if (region == null) {
            throw new NotFoundException(String.format("Region with identifier '%s' not found",id));
        }
        return region;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param region
     * @return ResponseEntity
     */
    @GetMapping(name = "show")
    public ResponseEntity<?> RegionsItemJsonController.show(@ModelAttribute Region region) {
        return ResponseEntity.ok(region);
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param region
     * @return UriComponents
     */
    public static UriComponents RegionsItemJsonController.showURI(Region region) {
        return MvcUriComponentsBuilder
            .fromMethodCall(
                MvcUriComponentsBuilder.on(RegionsItemJsonController.class).show(region))
            .buildAndExpand(region.getId()).encode();
    }
    
}