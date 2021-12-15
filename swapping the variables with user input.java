import java.util.Scanner;

public class operators{

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the number:");
		int m = myObj.nextInt();
		System.out.println("Enter the number:");
		int n = myObj.nextInt();
		
		System.out.println("Before swapping:"+m +","+ n);
		m = m +n;
		n = m - n;
		m = m- n;
		System.out.println("After swapping:"+m +","+ n);
		
		
			
		}
		 
		
		 
}


