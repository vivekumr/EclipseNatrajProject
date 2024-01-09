package com.nit.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nit.model.EmployeeModel;
import com.nit.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl empService;
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/emp_report")
	public String showEmployeeReport(Map<String,Object> map) {
		//use service
		Iterable<EmployeeModel> itEmps = empService.getAllEmployee();
		System.out.println(itEmps);
		//put result in model attributes
		map.put("empsList", itEmps);
		//return LVN
		return "show_employee_report";
	}
	
	@GetMapping("/emp_add")//register employee form launching
	public String addEmployeePage(@ModelAttribute("emp") EmployeeModel emp) {
	
		return "register_employee";
	}
	
	/*
	//having Double posting or Form Duplication Problem.
	@PostMapping("/emp_add")
	public String registerEmployee(@ModelAttribute("emp") EmployeeModel emp,Map<String,Object> map) {
		
		String itEmp = empService.saveEmployee(emp);
		Iterable<EmployeeModel> itEmps = empService.getAllEmployee();
		map.put("empsList", itEmps);
		map.put("resultMsg", itEmp);
		
		return "show_employee_report";
	*/
	/*
	//Double posting or Form Duplication Problem.?
	 // PRG pattern to resolve to redirect
	
	//Having not using same request and respons object 
	@PostMapping("/emp_add")
	public String registerEmployee(@ModelAttribute("emp") EmployeeModel emp,Map<String,Object> map) {
		
		String itEmp = empService.saveEmployee(emp);
		Iterable<EmployeeModel> itEmps = empService.getAllEmployee();
		map.put("empsList", itEmps);
		map.put("resultMsg", itEmp);
		
		return "redirect:emp_report";
	}*/
	
	/*
	// with falsh atributes(RedirectAttributes) we can send the data from this method to target method
	//If we give next request to dest method of redirection by using refresh button. The earlist displayed FLASH ATTRIBUTES related message will not come
	//if want to continue that message take support of session attributes
	@PostMapping("/emp_add")
	public String registerEmployee(@ModelAttribute("emp") EmployeeModel emp,RedirectAttributes rtrAttr) {
		//use service
		String itEmp = empService.saveEmployee(emp);
		//keep result in flash attributes
		rtrAttr.addFlashAttribute("resultMsg", itEmp);
		//return LVN
		return "redirect:emp_report";
	}
	*/
	//Session Attributes
	@PostMapping("/emp_add")
	public String registerEmployee(@ModelAttribute("emp") EmployeeModel emp,HttpSession httpSes) {
		//use service
		String itEmp = empService.saveEmployee(emp);
		//keep result in Session attributes
		httpSes.setAttribute("resultMsg", itEmp);
		//return LVN
		return "redirect:emp_report";
	}
	
	@GetMapping("/emp_edit")
	public String editEmployee(@RequestParam("no") int eno,@ModelAttribute("emp") EmployeeModel emp ) {
		//use service
		EmployeeModel itEmp=empService.getEmpbyEno(eno);
		//copy the data
		BeanUtils.copyProperties(itEmp, emp);
		//return LVN
		return "update_employee";
	}
	@PostMapping("/emp_edit")
	public String updateEmployee(@ModelAttribute("emp") EmployeeModel emp,HttpSession httpSes) {
		//use service
		String itEmp=empService.saveEmployee(emp);
		//keep result in Session attributes
		httpSes.setAttribute("resultMsg", itEmp);
		//return LVN
		return "redirect:emp_report";
	}
	
	@GetMapping("/emp_delete")
	public String deleteEmployee(@RequestParam("no") int eno,HttpSession httpSes) {
		String result=empService.deleteEmpByEno(eno);
		httpSes.setAttribute("deletetMsg", result);
		return  "redirect:emp_report";
	}
	
}
