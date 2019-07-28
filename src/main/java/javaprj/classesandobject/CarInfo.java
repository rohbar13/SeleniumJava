package javaprj.classesandobject;

public class CarInfo {

	public static void main(String ar[]) {
		CarClass cclass = new CarClass();
		
		CarEngineClass cec = new CarEngineClass();
		
		cec.cc=600;
		cec.engineName="NANO-600";
		cec.engineType="Petrol";
		cec.chasisNumber=784544;
		
		cclass.printCarEngineDetails(cec);
	}
	
}
