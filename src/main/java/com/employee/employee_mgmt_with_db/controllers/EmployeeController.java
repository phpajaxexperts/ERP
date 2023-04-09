package com.employee.employee_mgmt_with_db.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.employee.employee_mgmt_with_db.dao.EmployeeDetailsDAO;
import com.employee.employee_mgmt_with_db.models.EmployeeDetails;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDetailsDAO employeeDetailsDAO;

    @RequestMapping(value = "/", method = RequestMethod.GET) 
    public String home() {
        return "home.jsp";
    }


    @RequestMapping(value = "/add-employee-form", method = RequestMethod.GET) 
    public String addEmployeeForm() {
        return "add-employee-form.jsp";
    }

    @RequestMapping(value = "/add-employee", method = RequestMethod.POST)
    public ModelAndView addEmployee(EmployeeDetails EmployeeDetails) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("EmployeeDetails", EmployeeDetails);
        mav.setViewName("add-employee.jsp");

        employeeDetailsDAO.save(EmployeeDetails);
        return mav;
    }

    @RequestMapping(value = "/get-employee", method = RequestMethod.GET)
    public ModelAndView getEmployee(@RequestParam int id) {
        ModelAndView mav = new ModelAndView("show-employee.jsp");
        EmployeeDetails employeeDetails = employeeDetailsDAO.findById(id).orElse(null);
        mav.addObject(employeeDetails);
        return mav;
    }

    @RequestMapping(value = "/delete-employee", method = RequestMethod.GET)
    public ModelAndView deleteEmployee(@RequestParam int id) {
        ModelAndView mav = new ModelAndView("delete-employee.jsp");
        EmployeeDetails employeeDetails = employeeDetailsDAO.findById(id).orElse(null);
        employeeDetailsDAO.delete(employeeDetails);
        mav.addObject(employeeDetails);
        return mav;
    }

    @RequestMapping(value = "/edit-employee-form", method = RequestMethod.GET) 
    public ModelAndView editEmployeeForm(@RequestParam int id) {
        ModelAndView mav = new ModelAndView("edit-employee-form.jsp");
        EmployeeDetails employeeDetails = employeeDetailsDAO.findById(id).orElse(null);
        mav.addObject(employeeDetails);
        return mav;
    }

    // public ModelAndView updateEmployee(@RequestParam int id, EmployeeDetails EmployeeDetails) {
    //     ModelAndView mav = new ModelAndView("update-employee.jsp");
    //     mav.addObject("EmployeeDetails", EmployeeDetails);
    //     EmployeeDetails employeeDetails = employeeDetailsDAO.findById(id).orElse(null);
    //     employeeDetails.first_name = EmployeeDetails.getFirst_name();
    //     employeeDetailsDAO.save(employeeDetails);
    //     return mav;
    // }


    // @RequestMapping(value = "/get-employees", method = RequestMethod.GET)
    // public ModelAndView getEmployees() {
    //     ModelAndView mav = new ModelAndView("show-employee.jsp");
    //     List<EmployeeDetails> employeeDetails = employeeDetailsDAO.findAll();
    //     mav.addObject(employeeDetails);
    //     return mav;
    // }

}
