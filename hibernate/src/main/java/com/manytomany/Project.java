package com.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	@Column(name = "p_id")
	private int pId;

	@Column(name = "p_name")
	private String pName;

	@ManyToMany
	@JoinTable(name = "project_emp", joinColumns = {
			@JoinColumn(name = "project_id") }, inverseJoinColumns = {
					@JoinColumn(name = "emp_id") })
	private List<Employee> employees;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pId, String pName, List<Employee> employees) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pName=" + pName + ", employees=" + employees + "]";
	}

}
