package javaprj.classesandobject;

class ManagerClass {
	
	int emp_code;
	short age;
	String name;
	
	void managerLeaveDetails() {
		if(age>=30) {
			System.out.println("Leave count annual : 30");
		}else {
			System.out.println("Leave count annual : 24");
		}
	}
	
	void attendMeeting() {
		System.out.println("Attends Meeting");
	}
	
	void reporting() {
		System.out.println("Compiles Reports");
	}
}
