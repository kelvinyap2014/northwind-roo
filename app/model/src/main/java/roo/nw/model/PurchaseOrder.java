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
import java.util.Calendar;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.ws.annotations.jaxb.RooJaxbEntity;

/**
 * = PurchaseOrder
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "NW_PURCHASE_ORDERS")
@RooEquals(isJpaEntity = true)
@RooJaxbEntity
public class PurchaseOrder {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @SequenceGenerator(name = "purchaseOrderGen", sequenceName = "NW_PURCHASE_ORDERS_PURCHASE_ORDER_ID_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "purchaseOrderGen")
    @Column(name = "PURCHASE_ORDER_ID")
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
    @JoinColumn(name = "EMPLOYEE")
    @EntityFormat
    private Employee employee;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT")
    @EntityFormat
    private Product product;

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
    @Column(name = "QUANTITY")
    @NumberFormat
    private Integer quantity;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "ORDER_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar orderDate;
}
