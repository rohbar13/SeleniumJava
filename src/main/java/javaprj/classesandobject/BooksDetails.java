package javaprj.classesandobject;

public class BooksDetails {
	public static void main(String[] arg) {
		
		Books b = new Books();
		
		b.x = 50;
		b.y = 10;
		System.out.println(b.x);
		System.out.println(b.y);
		calculate(b);
		System.out.println(b.x);
		System.out.println(b.y);
	}
	
	public static void calculate(Books bk) {
		bk.x = 400;
		bk.y = 200;
	}
}
