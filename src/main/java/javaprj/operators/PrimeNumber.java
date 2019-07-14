package javaprj.operators;

public class PrimeNumber {
	public static void main(String arg[]) {
		
		for(int x=1;x<=100;x++)
		{
			boolean prime = true;
			for(int l=2;l<=x/2;l++) {
				if(x%l==0) {
					prime = false;
					break;
				}
			}
			if(prime==false) {
				System.out.println(x+ " is not a prime");
			}else {
				System.out.println(x+ " is a prime");
			}
		}
	}
}
