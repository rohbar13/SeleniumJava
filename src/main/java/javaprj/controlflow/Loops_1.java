package javaprj.controlflow;
public class Loops_1 {
	public static void main(String[] args) {
		int maxrownum = 5;
		for(int x=1;x<=maxrownum;x++) 
		{	
			for(int z=maxrownum-x;z>0;z--) {
				System.out.print(" ");
			}
			for(int y=1;y<=(x*2)-1;y++) 
			{	
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
