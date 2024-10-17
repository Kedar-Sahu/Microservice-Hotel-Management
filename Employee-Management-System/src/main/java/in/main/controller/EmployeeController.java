package in.main.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import in.main.entity.Employee;
import in.main.service.EmployeeService;
import jakarta.servlet.http.HttpSession;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/employeesDetails")
	public String emp_edit(Model m) {
		List<Employee> list=employeeService.getAllemployee();
		m.addAttribute("emp",list);
		return "employeesDetails";
	}
	
	@GetMapping("/emp_edit/{id}")
	public String emp_edit(@PathVariable long id,Model m) {
	
		Employee emp=employeeService.getEmpById(id);
		m.addAttribute("emp", emp);
		
		return "emp_edit";
	}
	
	@GetMapping("/emp_save")
	public String emp_save() {
		return "emp_save";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute Employee employee,HttpSession session) {
		System.out.println(employee);
		Employee emp=employeeService.saveEmp(employee);
		if(emp != null) {
			session.setAttribute("msg", "Register Successfully");
		}
		else {
			session.setAttribute("msg", "Register failed");
		}
		return "redirect:/emp_save";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Employee employee,HttpSession session) {
		System.out.println(employee);
		Employee emp=employeeService.saveEmp(employee);
		if(emp != null) {
			session.setAttribute("msg", "update Successfully");
		}
		else {
			session.setAttribute("msg", "Register failed");
		}
		return "redirect:/employeesDetails";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable long id ,HttpSession session) {
		boolean emp=employeeService.deleteEmp(id);
		if(emp) {
			session.setAttribute("msg", "delete successfully");
		}
		else {
			session.setAttribute("msg", "delete failed");
		}
		return "redirect:/employeesDetails";
	}
}
