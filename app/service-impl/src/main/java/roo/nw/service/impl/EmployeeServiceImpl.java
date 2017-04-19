package roo.nw.service.impl;
import org.springframework.roo.addon.layers.service.annotations.RooServiceImpl;
import roo.nw.service.api.EmployeeService;
import io.springlets.mail.MailReceiverService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * = EmployeeServiceImpl
 *
 * TODO Auto-generated class documentation
 *
 */
@RooServiceImpl(service = EmployeeService.class)
public class EmployeeServiceImpl implements EmployeeService {

    /**
     * TODO Auto-generated attribute documentation
     *
     */
    @Autowired
    private MailReceiverService mailReceiver;
}
