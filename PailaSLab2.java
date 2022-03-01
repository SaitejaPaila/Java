
package pailaslab2;

import java.util.Scanner;



public class PailaSLab2 {

    
    public static void main(String[] args) {
        
       ////PART 1
        
        Scanner input = new Scanner (System.in);
        System.out.print("How long is the side1?: ");
        int side1 = input.nextInt();
        System.out.print("How long is the side2?: ");
        int side2 = input.nextInt();
        double hypotenuse = Math.sqrt((side1 *side1) + (side2*side2));
       
        System.out.println("The length of hypotenuse is " + hypotenuse);
                
//        



    /// PART 2 
    
    
        Scanner grade = new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        double percentage = grade.nextDouble();
        if(percentage >= 90){
            System.out.println("Your letter grade is: A");
        }
        else if (percentage>=80 && percentage <90){
            System.out.println("Your letter grade is: B");
        }
         else if (percentage>=70 && percentage <80){
            System.out.println("Your letter grade is: C");
        }
         else if (percentage>=60 && percentage <70){
            System.out.println("Your letter grade is: D");
        }
         else{
             System.out.println("Your letter grade is:F");
         }
        
        
       
    }
    
}
