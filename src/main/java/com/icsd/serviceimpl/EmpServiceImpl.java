package com.icsd.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.icsd.model.EmpModel;

import com.icsd.repo.EmpRepository;
import com.icsd.servicei.EmpService;

@Service
public class EmpServiceImpl implements EmpService 
{
	
	@Autowired
	EmpRepository empRepository;
	
	public List<EmpModel> getEmployeeList()
	{
	return 	empRepository.findAll();
		
	}

	public EmpModel getEmployeeById(int empid) {
		// TODO Auto-generated method stub
		return empRepository.findById(empid).get();
	}

	public void addEmployee(EmpModel emp) {
		// TODO Auto-generated method stub
		empRepository.save(emp);
		System.out.println("emp saved");
	}

	public void deleteEmp(int empid) {
		// TODO Auto-generated method stub
		empRepository.deleteById(empid);
	}

	public void updateEmp(EmpModel emp) {
		// TODO Auto-generated method stub
		empRepository.save(emp);
	}
	
	
}
