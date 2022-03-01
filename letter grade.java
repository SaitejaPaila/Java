import java.util.Scanner;
public class letter_grade{

  public static void main(String[]args){
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
        
