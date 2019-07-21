package javaprj.classesandobject;

class AssociatesClass {

	int emp_code;
	short age;
	String name;

	public static void main(String arg[]) {
		setManager();
	}
	
	static void setManager() {
		Integer i = new Integer(10);
		ManagerClass manager1 = new ManagerClass();
		manager1.emp_code = 101;
		manager1.name="Atul";
		manager1.age=20;
		manager1.attendMeeting();
		manager1.reporting();
		manager1.managerLeaveDetails();
		
		ManagerClass manager2 = new ManagerClass();
		manager2.age=30;
		manager2.managerLeaveDetails();
	}
	
	void attendMeeting() {
		System.out.println("Attends Meeting");
	}
	
	void reporting() {
		System.out.println("Compiles Reports");
	}
}
