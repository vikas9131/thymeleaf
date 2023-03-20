package com.example1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example1.Entity.Employee;
import com.example1.service.EmployeeService;
import com.example1.serviceImpl.EmployeeServiceImpl;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	EmployeeService employeeService;
	 
	@GetMapping("/print")
	public String a1(Model model)
	{
		 model.addAttribute("allemplist", employeeService.getAllEmployee());
		System.out.println("HII");
		return "index";
	}
	@PutMapping("/putdata")
	public String save(@RequestBody Employee emp)
	{
		System.out.println("HII");
		employeeService.saveEmployee(emp);
		return "login";
		
	}
	
	
	@GetMapping("/print1")
	public String a11()
	{
	    System.out.println("HII");
		return "registration";
	}
	  @GetMapping("/")
	    public String viewHomePage(Model model) {
	        model.addAttribute("allemplist", employeeService.getAllEmployee());
	        return "index";
	    }
	  
	  
	  @GetMapping("/addnew")
	    public String addNewEmployee(Model model) {
	        Employee employee = new Employee();
	        model.addAttribute("employee", employee);
	        return "newemployee";
	    }
	  @PostMapping("/save")
	    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
	       
		  employeeService.saveEmployee(employee);
	        return "redirect:/";
	    }
	  @GetMapping("/showFormForUpdate/{id}")
	    public String updateForm(@PathVariable(value = "id") long id, Model model) {
	        Employee employee = employeeService.getById(id);
	        model.addAttribute("employee", employee);
	        return "update";
	    }
	  
	  @GetMapping("/deleteEmployee/{id}")
	    public String deleteThroughId(@PathVariable(value = "id") long id) {
	        employeeService.deleteViaId(id);
	        return "redirect:/";

}
	 @GetMapping("/login")
	 public String validate(Model model)
	 {
		 model.addAttribute("employee", addNewEmployee(null));
		 return "login";
	 }
}
