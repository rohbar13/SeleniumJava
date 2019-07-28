package javaprj.classesandobject;

public class ABC_Employee {

	public static void main(String arg[]) {
		
		ABC_Emloyee_Details details = new ABC_Emloyee_Details();
		
		details.empcode = 109;
		details.name = "rk";
		details.companyname = "ABC";
		details.exp = 10;
		details.departmentName = "pro";
		details.salary = 1541111;
		details.grade = 1;
		details.projectcode = 2323;
		details.onBench = false;
		details.fathersname="XYZ";
		
		
		printEmployeeInfo(details);
		printForAccounts(details);
		printForHRInfo(details);
		printEmployeeInfo(details);
		printForAccounts(details);
		printForHRInfo(details);
		printEmployeeInfo(details);
		printForAccounts(details);
		printForHRInfo(details);
		printEmployeeInfo(details);
		printForAccounts(details);
		printForHRInfo(details);
		printEmployeeInfo(details);
		printForAccounts(details);
		printForHRInfo(details);
		printEmployeeInfo(details);
		printForAccounts(details);
		printForHRInfo(details);
		printEmployeeInfo(details);
		printForAccounts(details);
		printForHRInfo(details);
		
	}
	
	
	public static void printEmployeeInfo(ABC_Emloyee_Details abc) {
		System.out.println(abc.companyname);
	}
	
	public static void printForAccounts(ABC_Emloyee_Details abc) {
		System.out.println(abc.empcode);
	}
	
	public static void printForHRInfo(ABC_Emloyee_Details abc) {
		System.out.println(abc.projectcode);
		System.out.println(abc.fathersname);
	}
	
	
	
	
}
