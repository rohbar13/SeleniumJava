package javaprj.classesandobject;

public class Employee {
	private int salary;
	private int noofhours;
	
	public Employee(int salary,int noofhours) {
		this.salary = salary;
		this.noofhours = noofhours;
	}
	
	public void addSal() {
		if(salary<500) {
			salary = salary+10;
		}
	}
	
	public void addWork() {
		if(noofhours>6) {
			noofhours = noofhours+5;
		}
	}
}
