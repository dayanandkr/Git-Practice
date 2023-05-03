package com.wowfinstack.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wowfinstack.employee.model.Employee;
import com.wowfinstack.employee.repository.EmpRepository;

@Service
public class EmpService{
	
	@Autowired
	private EmpRepository empRepository;
	
	public Employee addEmp(Employee emp) {
		try{
			return empRepository.save(emp);
		}catch(Exception e) {
			System.out.println("Exception Occured in EmpService.addEmp :"+e.getMessage()+" Cause : "+e.getCause());
		}
		return null;
	}
	
	public void deleteEmp(int id) {
		try{
			empRepository.deleteById(id);
		}catch(Exception e) {
			System.out.println("Exception Occured in EmpService.deleteEmp :"+e.getMessage()+" Cause : "+e.getCause());
		}
	
	}
	
	public List<Employee> getAllEmp(){
		try{
			return empRepository.findAll();
		}catch(Exception e) {
			System.out.println("Exception Occured in EmpService.getAllEmp :"+e.getMessage()+" Cause : "+e.getCause());
		}
		return null;
	}
	
	public Employee getByIdEmp(int id) {
		try{
			return empRepository.findById(id).get();
		}catch(Exception e) {
			System.out.println("Exception Occured in EmpService.getByIdEmp :"+e.getMessage()+" Cause : "+e.getCause());
		}
		return null;
	}

}
