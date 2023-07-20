package com.monocept.inheritence.Manager;

public class Manager extends Employee {
	
	private int salary;
	
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	void setManager(String name,String address,int employeeId,int salary) {
		this.setEmployeeId(employeeId);
		this.setAddress(address);
		this.setName(name);
		this.setSalary(salary);
	}
	
	void showManager() {
		System.out.println("Employee id "+this.getEmployeeId());
		System.out.println("Name "+this.getName());
		System.out.println("Address "+this.getAddress());
		System.out.println("Salary "+this.getSalary());
	}
	
}
