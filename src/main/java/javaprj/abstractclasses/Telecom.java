package javaprj.abstractclasses;

public abstract class Telecom {

	String providerName;
	
	public Telecom(String providerName) {
		this.providerName = providerName;
		System.out.println("Hello Print");
	}
	
	
	public void getProviderName() {
		System.out.println(providerName);
	}
	
	public abstract void getProviderOwnerName(int x);
	
	public abstract void getProviderOwnerDetails(int x);
	
}
