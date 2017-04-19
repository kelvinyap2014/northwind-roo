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
 * = Country
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean(settersByDefault = false)
@RooToString
@RooJpaEntity(table = "NW_COUNTRIES", readOnly = true)
@RooEquals(isJpaEntity = true)
@RooJaxbEntity
public class Country {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @SequenceGenerator(name = "countryGen", sequenceName = "NW_COUNTRIES_COUNTRY_ID_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "countryGen")
    @Column(name = "COUNTRY_ID")
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
    @Column(name = "DESCRIPTION")
    private String description;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "country")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<Party> parties = new HashSet<Party>();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "country")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<Region> regions = new HashSet<Region>();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "country")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<CustomerOrder> customerOrders = new HashSet<CustomerOrder>();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "country")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<Store> stores = new HashSet<Store>();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "country")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<Supplier> suppliers = new HashSet<Supplier>();
}
