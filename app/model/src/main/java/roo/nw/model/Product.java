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
import java.math.BigDecimal;
import org.springframework.format.annotation.NumberFormat;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import org.springframework.roo.addon.ws.annotations.jaxb.RooJaxbEntity;

/**
 * = Product
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "NW_PRODUCTS", entityFormatExpression = "#{name} #{code}")
@RooEquals(isJpaEntity = true)
@RooJaxbEntity
public class Product {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @SequenceGenerator(name = "productGen", sequenceName = "NW_PRODUCTS_PRODUCT_ID_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productGen")
    @Column(name = "PRODUCT_ID")
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
    @JoinColumn(name = "CATEGORY")
    @EntityFormat
    private Category category;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "NAME")
    private String name;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "CODE")
    private String code;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "QUANTITY_PER_UNIT")
    private String quantityPerUnit;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "UNIT_COST")
    @NumberFormat
    private BigDecimal unitCost;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "UNIT_PRICE")
    @NumberFormat
    private BigDecimal unitPrice;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "UNITS_IN_STOCK")
    @NumberFormat
    private Integer unitsInStock;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "REORDER_LEVEL")
    @NumberFormat
    private Integer reorderLevel;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "DISCONTINUED")
    private Boolean discontinued;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "product")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<PurchaseOrder> purchaseOrders = new HashSet<PurchaseOrder>();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "product")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SUPPLIER")
    @EntityFormat
    private Supplier supplier;
}
