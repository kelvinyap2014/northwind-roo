// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package roo.nw.application.web;

import roo.nw.application.web.EmployeesItemThymeleafController;
import roo.nw.service.api.EmployeeService;

privileged aspect EmployeesItemThymeleafController_Roo_Controller {
    
    /**
     * TODO Auto-generated attribute documentation
     * 
     */
    private EmployeeService EmployeesItemThymeleafController.employeeService;
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @return EmployeeService
     */
    public EmployeeService EmployeesItemThymeleafController.getEmployeeService() {
        return employeeService;
    }
    
    /**
     * TODO Auto-generated method documentation
     * 
     * @param employeeService
     */
    public void EmployeesItemThymeleafController.setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
}