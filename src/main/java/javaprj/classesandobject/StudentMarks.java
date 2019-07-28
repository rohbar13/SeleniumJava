package javaprj.classesandobject;

public class StudentMarks {
	
	public static void main(String str[]) {
		Student s= new Student(100, 100, 100);
		Student s2= new Student(50, 50, 50, 50, 50);
		System.out.println(s.percentage());
		System.out.println(s2.percentage());
	}
}
