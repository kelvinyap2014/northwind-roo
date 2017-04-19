package roo.nw.model;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.persistence.Column;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import org.springframework.roo.addon.ws.annotations.jaxb.RooJaxbEntity;

/**
 * = Customer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "NW_CUSTOMERS")
@RooJaxbEntity
public class Customer extends Party {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "COMPANY_NAME")
    private String companyName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "CONTACT_NAME")
    private String contactName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "CONTACT_TITLE")
    private String contactTitle;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "FAX")
    private String fax;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "customer")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<CustomerOrder> customerOrders = new HashSet<CustomerOrder>();
}
