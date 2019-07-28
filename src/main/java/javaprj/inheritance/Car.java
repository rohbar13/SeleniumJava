package javaprj.inheritance;

public class Car extends Vehicle{
	
	public Car(int wheels, int chasisnumber, String name, String category, String gear) {
		super(wheels, chasisnumber, name, category, gear);
		System.out.println("Constructor of Car");
	}
	
}
