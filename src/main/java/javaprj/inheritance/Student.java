package javaprj.inheritance;

public class Student {

	private int rollNum, age, className;
	String name;
	
	public Student() {
		System.out.println("Default");
	}
	
	public Student(int age) {
		this();
		if(age>10) {
			System.out.println(age);
		}
	}
	
	
	public Student(int age,String name) {
		this(age);
		if(age>10) {
			System.out.println(name + " is unfit for this class at age " + age);
		}
	}
	
	
	public Student(int rollNum,int age,String name,int className) {
		this(age,name);
		this.rollNum = rollNum;
		this.age = age;
		this.name = name;
		this.className = className;
	}
	
}
