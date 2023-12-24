package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	
	private String employeeName;
	private List<String> phoneNos;
	private Set<String> addresses;
	private Map<String, String> courses;
	private Properties props;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public List<String> getPhoneNos() {
		return phoneNos;
	}
	public void setPhoneNos(List<String> phoneNos) {
		this.phoneNos = phoneNos;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String employeeName, List<String> phoneNos, Set<String> addresses, Map<String, String> courses,
			Properties props) {
		super();
		this.employeeName = employeeName;
		this.phoneNos = phoneNos;
		this.addresses = addresses;
		this.courses = courses;
		this.props = props;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", phoneNos=" + phoneNos + ", addresses=" + addresses
				+ ", courses=" + courses + ", props=" + props + "]";
	}

	
}
