package javaprj.controlflow;

public class While {
	public static void main(String[] args) {
		int y = 6;
		boolean con = true;
		while (con) {
			System.out.println("Hello");
			y++;
			if(y>10)
			{
				break;
			}
		}

	}
}
