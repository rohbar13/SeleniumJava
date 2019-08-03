package javaprj.inheritance;

public class StudentInfo extends Student{

	public StudentInfo(int rollNum,int age,String name,int className,String school,String bloodgroup) {
		super(rollNum,age,name,className);
		System.out.println(school+" , "+bloodgroup);
	}



	
}
