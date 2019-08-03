package javaprj.inheritance;

public class StudentInfo_2{

	public StudentInfo_2(String school,String bloodgroup) {
		StudentInfo si = new StudentInfo(101,11,"Rohan",5,school, bloodgroup);
	}
	
	public static void main(String arg[]) {
		StudentInfo_2 s = new StudentInfo_2("DPS","O+");
	}
	
}
