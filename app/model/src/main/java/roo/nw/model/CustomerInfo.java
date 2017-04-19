package roo.nw.model;
import org.springframework.roo.addon.dto.annotations.RooEntityProjection;
import org.springframework.roo.addon.javabean.annotations.RooEquals;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;

/**
 * = CustomerInfo
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean(settersByDefault = false)
@RooToString
@RooEquals
@RooEntityProjection(entity = Customer.class, fields = { "id", "companyName", "email", "fax" }, formatExpression = "#{companyName}")
public class CustomerInfo {

    private Long id;

    private String companyName;

    private String email;

    private String fax;
}
