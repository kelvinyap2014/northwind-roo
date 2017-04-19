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
import java.util.Calendar;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import java.math.BigDecimal;
import org.springframework.format.annotation.NumberFormat;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import org.springframework.roo.addon.ws.annotations.jaxb.RooJaxbEntity;

/**
 * = CustomerOrder
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "NW_CUSTOMER_ORDERS", entityFormatMessage = "customerorder_format")
@RooEquals(isJpaEntity = true)
@RooJaxbEntity
public class CustomerOrder {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @SequenceGenerator(name = "customerOrderGen", sequenceName = "NW_CUSTOMER_ORDERS_CUSTOMER_ORDER_ID_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customerOrderGen")
    @Column(name = "CUSTOMER_ORDER_ID")
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
    @JoinColumn(name = "CUSTOMER")
    @EntityFormat
    private Customer customer;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "ORDER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar orderDate;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "REQUIRED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar requiredDate;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "SHIPPED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar shippedDate;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "FREIGHT")
    @NumberFormat
    private BigDecimal freight;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "SHIP_NAME")
    private String shipName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "SHIP_ADDRESS")
    private String shipAddress;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "SHIP_POSTAL_CODE")
    private String shipPostalCode;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private Status status;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "SHIP_PHONE")
    private String shipPhone;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "INVOICE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar invoiceDate;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "CLOSE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar closeDate;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "customerOrder")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMPLOYEE")
    @EntityFormat
    private Employee employee;

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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHIPPER")
    @EntityFormat
    private Shipper shipper;
}
