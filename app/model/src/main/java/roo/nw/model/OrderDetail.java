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
import org.springframework.roo.addon.ws.annotations.jaxb.RooJaxbEntity;

/**
 * = OrderDetail
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "NW_ORDER_DETAILS")
@RooEquals(isJpaEntity = true)
@RooJaxbEntity
public class OrderDetail {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @SequenceGenerator(name = "orderDetailGen", sequenceName = "NW_ORDER_DETAILS_ORDER_DETAIL_ID_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orderDetailGen")
    @Column(name = "ORDER_DETAIL_ID")
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
    @JoinColumn(name = "CUSTOMER_ORDER")
    @EntityFormat
    private CustomerOrder customerOrder;

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
    @Column(name = "QUANTITY")
    @NumberFormat
    private Integer quantity;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "DISCOUNT")
    @NumberFormat
    private BigDecimal discount;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT")
    @EntityFormat
    private Product product;
}
