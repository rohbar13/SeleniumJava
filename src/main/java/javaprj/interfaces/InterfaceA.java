package javaprj.interfaces;

interface InterfaceA extends InterfaceB {
	
	int x = 10;

	void methoda();
	
	static void main() {
		System.out.println("Hello");
	}

	default void show() {
		System.out.println("Hello World");
	}
	
	default void show1() {
		System.out.println("Hello World");
	}

}
