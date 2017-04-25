// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package roo.nw.application.config.jackson;

import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.boot.jackson.JsonComponent;
import roo.nw.application.config.jackson.DomainModelModule;
import roo.nw.application.web.CategoryJsonMixin;
import roo.nw.application.web.CityJsonMixin;
import roo.nw.application.web.CountryJsonMixin;
import roo.nw.application.web.CustomerJsonMixin;
import roo.nw.application.web.CustomerOrderJsonMixin;
import roo.nw.application.web.EmployeeJsonMixin;
import roo.nw.application.web.OrderDetailJsonMixin;
import roo.nw.application.web.PartyJsonMixin;
import roo.nw.application.web.ProductJsonMixin;
import roo.nw.application.web.PurchaseOrderJsonMixin;
import roo.nw.application.web.RegionJsonMixin;
import roo.nw.application.web.ReportJsonMixin;
import roo.nw.application.web.ShipperJsonMixin;
import roo.nw.application.web.SoldProductJsonMixin;
import roo.nw.application.web.StoreJsonMixin;
import roo.nw.application.web.SupplierJsonMixin;
import roo.nw.model.Category;
import roo.nw.model.City;
import roo.nw.model.Country;
import roo.nw.model.Customer;
import roo.nw.model.CustomerOrder;
import roo.nw.model.Employee;
import roo.nw.model.OrderDetail;
import roo.nw.model.Party;
import roo.nw.model.Product;
import roo.nw.model.PurchaseOrder;
import roo.nw.model.Region;
import roo.nw.model.Report;
import roo.nw.model.Shipper;
import roo.nw.model.SoldProduct;
import roo.nw.model.Store;
import roo.nw.model.Supplier;

privileged aspect DomainModelModule_Roo_DomainModelModule {
    
    declare parents: DomainModelModule extends SimpleModule;
    
    declare @type: DomainModelModule: @JsonComponent;
    
    /**
     * TODO Auto-generated constructor documentation
     * 
     */
    public DomainModelModule.new() {
        // Mixin registration
        
        setMixInAnnotation(Category.class, CategoryJsonMixin.class);
        setMixInAnnotation(City.class, CityJsonMixin.class);
        setMixInAnnotation(Country.class, CountryJsonMixin.class);
        setMixInAnnotation(Customer.class, CustomerJsonMixin.class);
        setMixInAnnotation(CustomerOrder.class, CustomerOrderJsonMixin.class);
        setMixInAnnotation(Employee.class, EmployeeJsonMixin.class);
        setMixInAnnotation(OrderDetail.class, OrderDetailJsonMixin.class);
        setMixInAnnotation(Party.class, PartyJsonMixin.class);
        setMixInAnnotation(Product.class, ProductJsonMixin.class);
        setMixInAnnotation(PurchaseOrder.class, PurchaseOrderJsonMixin.class);
        setMixInAnnotation(Region.class, RegionJsonMixin.class);
        setMixInAnnotation(Report.class, ReportJsonMixin.class);
        setMixInAnnotation(Shipper.class, ShipperJsonMixin.class);
        setMixInAnnotation(SoldProduct.class, SoldProductJsonMixin.class);
        setMixInAnnotation(Store.class, StoreJsonMixin.class);
        setMixInAnnotation(Supplier.class, SupplierJsonMixin.class);
    }

}