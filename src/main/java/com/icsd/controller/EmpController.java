package com.icsd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.icsd.model.EmpModel;

import com.icsd.servicei.EmpService;

@RestController
public class EmpController 
{
	
	@Autowired
	EmpService empService;
	
	@GetMapping("/employees")
	public   List<EmpModel> getEmployeeList()
	{
		return empService.getEmployeeList();
	}
	
	@GetMapping("/employees/{empid}")
	public EmpModel getEmployeeById(@PathVariable("empid") int empid)//employess/1
	//path param- employees/1-- this is pura url.
	{
		System.out.println("insde get with id");
		return empService.getEmployeeById(empid);
	}
//	To be able to convert the JSON sent as HTTP Body content into a Java object which we can use in our application we need to use the @RequestBody annotation for the method argument.
//	Convert JSON into our own custom class
//	When we use the @RequestBody to annotate the method argument we are telling the framework to convert the JSON or XML payload which is in the request body of HTTP request into the object of a given type
	@PostMapping("/employees")
	public void addEmployee(@RequestBody EmpModel emp)
	{
		//json - ename in json is smae as ename variabvle in class emp.
		System.out.println("hereeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		System.out.println(emp.getEmpno());
		System.out.println("Date received is : "+ emp);
		 empService.addEmployee(emp);
	}
	
	@DeleteMapping("/employees/{empid}")
	public void deleteEmployee(@PathVariable int empid)
	{
		System.out.println("inside delete");
		empService.deleteEmp(empid);
		
	}
	
	@PutMapping("/employees")
	public void updateEmployee(@RequestBody EmpModel emp)
	{
		System.out.println(emp.getEmpno());
		System.out.println(emp.getEname());
		System.out.println(emp.getHiredate());
		System.out.println("insidde put");
		empService.updateEmp(emp);
	}
}
