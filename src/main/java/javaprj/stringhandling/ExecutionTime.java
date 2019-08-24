package javaprj.stringhandling;

public class ExecutionTime {

	public static void main(String[] args) throws InterruptedException {

		long start = System.currentTimeMillis();
		Thread.sleep(5000);
		long end = System.currentTimeMillis();
		long total = end-start;
		System.out.println("in seconds : "+total/1000);
		
	}
}
