package javaprj.inheritance;

public class Maruti extends Car{
	
	String brandName;
	Engine engine;
	
	public Maruti(int wheels, int chasisnumber, String name, String category, String gear) {
		super(wheels, chasisnumber, name, category, gear);
		System.out.println("Constructor of Maruti");
	}

	public static void main(String arg[]) {
		Maruti c = new Maruti(2,254,"Maruti","4-wheeler","5");
		c.carinfo();
	}
	
	public void carinfo() {
		wheels = 10;
		shiftgear();
	}
	
}
