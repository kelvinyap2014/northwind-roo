package roo.nw.model;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.persistence.Column;
import java.util.Calendar;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Basic;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import org.springframework.roo.addon.ws.annotations.jaxb.RooJaxbEntity;

/**
 * = Employee
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(table = "NW_EMPLOYEES")
@RooJaxbEntity
public class Employee extends Party {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "FIRST_NAME")
    private String firstName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "LAST_NAME")
    private String lastName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "TITLE")
    private String title;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "BIRTH_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar birthDate;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "HIRE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Calendar hireDate;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "EXTENSION")
    private String extension;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "PHOTO")
    private String photo;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Column(name = "NOTES")
    private String notes;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "employee")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<PurchaseOrder> purchaseOrders = new HashSet<PurchaseOrder>();

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "employee")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<CustomerOrder> customerOrders = new HashSet<CustomerOrder>();
}
