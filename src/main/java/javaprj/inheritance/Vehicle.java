package javaprj.inheritance;

public class Vehicle {

	int wheels;
	int chasisnumber;
	String name;
	String category;
	String gear;
	

	public Vehicle(int wheels, int chasisnumber, String name, String category, String gear) {
		System.out.println("Constructor of Vehicle");
		
		this.wheels = wheels;
		this.chasisnumber = chasisnumber;
		this.name = name;
		this.category = category;
		this.gear = gear;
	}

	public void lock(){
		
	}
	
	public void unlock(){
		
	}
	
	public void start(){
		
	}
	
	public void off(){
		
	}
	
	public void shiftgear() {
	
	}
	
}
