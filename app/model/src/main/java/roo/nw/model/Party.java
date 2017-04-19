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
import org.springframework.roo.addon.ws.annotations.jaxb.RooJaxbEntity;

/**
 * = Party
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(inheritanceType = "JOINED", table = "NW_PARTIES")
@RooEquals(isJpaEntity = true)
@RooJaxbEntity
public class Party {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Id
    @SequenceGenerator(name = "partyGen", sequenceName = "NW_PARTIES_PARTY_ID_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "partyGen")
    @Column(name = "PARTY_ID")
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REGION")
    @EntityFormat
    private Region region;
}
