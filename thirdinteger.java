import java.util.*;
public class thirdinteger {
	
	public static boolean sumoftwo(int p, int q, int r) {
		return((p+q) == r || (q + r) == p || (r+p) == q );
		
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int x = in.nextInt();
		System.out.println("Enter the second number:");
		int y = in.nextInt();
		System.out.println("Enter the third number:");
		int z = in.nextInt();
		System.out.println("The result is:"+ sumoftwo(x,y,z));

	}

}
