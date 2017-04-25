// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package roo.nw.application.web;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import io.springlets.web.NotFoundException;
import java.io.IOException;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.core.convert.ConversionService;
import roo.nw.application.web.PurchaseOrderDeserializer;
import roo.nw.model.PurchaseOrder;
import roo.nw.service.api.PurchaseOrderService;

privileged aspect PurchaseOrderDeserializer_Roo_EntityDeserializer {
    
    declare @type: PurchaseOrderDeserializer: @JsonComponent;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return PurchaseOrderService
     */
    public PurchaseOrderService PurchaseOrderDeserializer.getPurchaseOrderService() {
        return purchaseOrderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param purchaseOrderService
     */
    public void PurchaseOrderDeserializer.setPurchaseOrderService(PurchaseOrderService purchaseOrderService) {
        this.purchaseOrderService = purchaseOrderService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return ConversionService
     */
    public ConversionService PurchaseOrderDeserializer.getConversionService() {
        return conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param conversionService
     */
    public void PurchaseOrderDeserializer.setConversionService(ConversionService conversionService) {
        this.conversionService = conversionService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param jsonParser
     * @param context
     * @param codec
     * @param tree
     * @return PurchaseOrder
     * @throws IOException
     */
    public PurchaseOrder PurchaseOrderDeserializer.deserializeObject(JsonParser jsonParser, DeserializationContext context, ObjectCodec codec, JsonNode tree) throws IOException {
        String idText = tree.asText();
        Long id = conversionService.convert(idText, Long.class);
        PurchaseOrder purchaseOrder = purchaseOrderService.findOne(id);
        if (purchaseOrder == null) {
            throw new NotFoundException("PurchaseOrder not found");
        }
        return purchaseOrder;
    }
    
}