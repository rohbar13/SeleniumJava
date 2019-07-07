package javaprj.arrays;

public class Array2 {
	public static void main(String[] args) {
		
		
		Object x1[] = new String[3];
        x1[0] = new Integer(0);

		int arr[][] = {{1,2},{3,4,5},{6,7,8,9}};
		
		//System.out.println("Length of Array "+arr.length);
		for(int x=0;x<arr.length;x++) {
			//System.out.println("Lenght of Array at "+x+" : "+arr[x].length);
			for(int y=0;y<arr[x].length;y++)
			{
				System.out.print(arr[x][y]+", ");
			}
			System.out.println();
		}
	}
}
