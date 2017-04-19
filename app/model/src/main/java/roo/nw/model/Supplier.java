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
import io.springlets.format.EntityFormat;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import javax.persistence.ManyToMany;
import org.springframework.roo.addon.ws.annotations.jaxb.RooJaxbEntity;

/**
 * = Supplier
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "NW_SUPPLIERS")
@RooEquals(isJpaEntity = true)
@RooJaxbEntity
public class Supplier {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @SequenceGenerator(name = "supplierGen", sequenceName = "NW_SUPPLIERS_SUPPLIER_ID_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "supplierGen")
    @Column(name = "SUPPLIER_ID")
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CITY")
    @EntityFormat
    private City city;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY")
    @EntityFormat
    private Country country;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REGION")
    @EntityFormat
    private Region region;

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
    @Column(name = "ADDRESS")
    private String address;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "POSTAL_CODE")
    private String postalCode;

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
    @Column(name = "FAX")
    private String fax;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "WEB")
    private String web;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "supplier")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<Product> products = new HashSet<Product>();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "suppliers")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<Store> stores = new HashSet<Store>();
}
