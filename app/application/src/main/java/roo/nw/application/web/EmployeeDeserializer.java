package roo.nw.application.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.convert.ConversionService;
import org.springframework.roo.addon.web.mvc.controller.annotations.config.RooDeserializer;
import roo.nw.model.Employee;
import roo.nw.service.api.EmployeeService;

/**
 * = EmployeeDeserializer
 *
 * TODO Auto-generated class documentation
 *
 */
@RooDeserializer(entity = Employee.class)
public class EmployeeDeserializer extends JsonObjectDeserializer<Employee> {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private EmployeeService employeeService;

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    private ConversionService conversionService;

    /**
     * TODO Auto-generated constructor documentation
     *
     * @param employeeService
     * @param conversionService
     */
    @Autowired
    public EmployeeDeserializer(@Lazy EmployeeService employeeService, ConversionService conversionService) {
        this.employeeService = employeeService;
        this.conversionService = conversionService;
    }
}
