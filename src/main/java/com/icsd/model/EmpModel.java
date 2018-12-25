package com.icsd.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name="emp")
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmpModel 
{
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	public void setComm(Double comm) {
		this.comm = comm;
	}
	@Id
	@Column(name="empno")
	public int empno;
	@Override
	public String toString() {
		return "EmpModel [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate="
				+ hiredate + ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}
	public EmpModel(int empno, String ename, String job, Integer mgr, Date hiredate, double sal, Double comm,
			int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
	public Integer getMgr() {
		return mgr;
	}
	public Double getComm() {
		return comm;
	}
	public String ename;
	public String job;
//	@JsonInclude(JsonInclude.Include.NON_NULL)
	public Integer mgr;//to handle null values - as mgr is having null value 
	public Date hiredate;
	
	public double sal;
	 
	
	public Double comm;//to handle null values - as comm is having null value
	public int deptno;
	
	
	
//	@ManyToOne
//	@JoinColumn(name ="deptno")
//	public DeptModel deptModel;

//public DeptModel getDeptModel() {
//		return deptModel;
//	}
//	public void setDeptModel(DeptModel deptModel) {
//		this.deptModel = deptModel;
//	}
	
	public EmpModel()
	{
		super();
		comm=null;//this null will be inserted into tbl emp.
		System.out.println("Employee model default cer called");
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}

//	public EmpModel(int empno, String ename, String job, Integer mgr, Date hiredate, double sal, Double comm,
//			int deptno, DeptModel deptModel) {
//		super();
//		this.empno = empno;
//		this.ename = ename;
//		this.job = job;
//		this.mgr = mgr;
//		this.hiredate = hiredate;
//		this.sal = sal;
//		this.comm = comm;
//	//	this.deptno = deptno;
//		this.deptModel = deptModel;
//	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}


	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	

}
