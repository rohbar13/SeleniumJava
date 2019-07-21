package javaprj.classesandobject;

public class Triangle {
//https://www.codesdope.com/practice/java-classes-and-objects/
	private int x;
	private int y;
	private int z;
	
	public Triangle(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public void printPerimeter() {
		System.out.println(x+y+z);
	}
}
