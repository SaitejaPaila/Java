
package hypotenuse;

import java.util.Scanner;



public class PailaSLab2 {

    
    public static void main(String[] args) {
        
      
        
        Scanner input = new Scanner (System.in);
        System.out.print("How long is the side1?: ");
        int side1 = input.nextInt();
        System.out.print("How long is the side2?: ");
        int side2 = input.nextInt();
        double hypotenuse = Math.sqrt((side1 *side1) + (side2*side2));
       
        System.out.println("The length of hypotenuse is " + hypotenuse
        
       
    }
    
}
