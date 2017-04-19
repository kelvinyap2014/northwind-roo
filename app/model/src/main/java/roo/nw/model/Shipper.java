package roo.nw.model;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import org.springframework.roo.addon.ws.annotations.jaxb.RooJaxbEntity;

/**
 * = Shipper
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "NW_SHIPPERS")
@RooEquals(isJpaEntity = true)
@RooJaxbEntity
public class Shipper {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @SequenceGenerator(name = "shipperGen", sequenceName = "NW_SHIPPERS_SHIPPER_ID_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "shipperGen")
    @Column(name = "SHIPPER_ID")
    private Long id;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Version
    @Column(name = "VERSION")
    private Long version;

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
    @Column(name = "PHONE")
    private String phone;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "shipper")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<CustomerOrder> customerOrders = new HashSet<CustomerOrder>();
}
