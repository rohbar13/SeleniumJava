package javaprj.classesandobject;

import java.text.DecimalFormat;

public class Student {
	DecimalFormat df = new DecimalFormat("###.##");
	
	public final String schoolName="DPS";
	private int maths;
	private int physics;
	private int english;
	private int computer;
	private int sanskrit;
	
	private int count;
	
	
	public Student(int maths,int physics,int english)
	{
		System.out.println("School Name : "+schoolName);
		
		this.maths=maths;
		this.physics=physics;
		this.english=english;
		count = 3;
	}
	
	public Student(int maths,int physics,int english,int computer,int sanskrit)
	{
		System.out.println("School Name : "+schoolName);
		
		this.maths=maths;
		this.physics=physics;
		this.english=english;
		this.computer=computer;
		this.sanskrit=sanskrit;
		count = 5;
	}
	
	
	public float percentage()
	{
		return (float)(maths+physics+english+computer+sanskrit)/count;
	}
	
}
