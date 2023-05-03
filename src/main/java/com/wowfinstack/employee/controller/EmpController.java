package com.wowfinstack.employee.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.wowfinstack.employee.model.Employee;
import com.wowfinstack.employee.service.EmpService;

@Controller
public class EmpController {
	
	
	private EmpService empService;
	
	@PostMapping("add-emp")
	public Employee addEmp(@RequestBody Employee emp) {
		return empService.addEmp(emp);
	}
	
	@GetMapping("getAll-emp")
	public List<Employee> getAllEmp(){
		return empService.getAllEmp();
	}
	
	@GetMapping("getById-emp/{empId}")
	public Employee getByIdEmp(int id) {
		return empService.getByIdEmp(id);
	}
	
	@DeleteMapping("delete-emp/{empId}")
	public void deleteEmp(int id) {
		empService.deleteEmp(id);
	}

}
