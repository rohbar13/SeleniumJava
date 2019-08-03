package javaprj.abstractclasses;

public class TelecomDisplay extends Telecom{

	public TelecomDisplay(String providerName) {
		super(providerName);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		TelecomDisplay td = new TelecomDisplay("AIRTEL");
		td.getProviderName();
	}

	public void getProviderName() {
		System.out.println(providerName);
	}

	@Override
	public void getProviderOwnerName(int x) {
		System.out.println(providerName);
	}

	@Override
	public void getProviderOwnerDetails(int x) {
		// TODO Auto-generated method stub
		
	}
	
	
}
