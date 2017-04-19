package roo.nw.model;
import org.springframework.roo.addon.dto.annotations.RooDTO;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooSerializable;
import org.springframework.format.annotation.NumberFormat;
import java.util.Calendar;
import org.springframework.format.annotation.DateTimeFormat;
import java.math.BigDecimal;

/**
 * = CustomerOrderFormBean
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDTO
@RooJavaBean
@RooSerializable
public class CustomerOrderFormBean {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long orderId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long employeeId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private Long customerId;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @DateTimeFormat(style = "M-")
    private Calendar orderDate;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String employeeName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private String customerCompanyName;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private Status status;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @DateTimeFormat(style = "M-")
    private Calendar shippedDate;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @NumberFormat
    private BigDecimal freight;
}
