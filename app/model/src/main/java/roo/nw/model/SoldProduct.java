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
import org.springframework.roo.addon.ws.annotations.jaxb.RooJaxbEntity;

/**
 * = SoldProduct
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "NW_SOLD_PRODUCT_VIEW")
@RooEquals(isJpaEntity = true)
@RooJaxbEntity
public class SoldProduct {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @SequenceGenerator(name = "soldProductGen", sequenceName = "NW_SHIPPERS_SHIPPER_ID_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "soldProductGen")
    @Column(name = "ID")
    private Long id;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Version
    @Column(name = "VERSION")
    private Long version;
}
