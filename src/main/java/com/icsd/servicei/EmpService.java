package com.icsd.servicei;

import java.util.List;

import com.icsd.model.EmpModel;

public interface EmpService 
{
	public List<EmpModel> getEmployeeList();

	public EmpModel getEmployeeById(int empid);

	public void addEmployee(EmpModel emp);

	public void deleteEmp(int empid);

	public void updateEmp(EmpModel emp);

}
