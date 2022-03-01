
package userinput;
import java.util.*; 

public class Userinput {

    
    public static void main(String[] args) {
        System.out.println("I can write Java now!");    
        System.out.println();
        System.out.println("Isn't that wonderful?");
        System.out.println();
        int x = 5;
        System.out.println("The square of x is 25"); 
           
        System.out.println();                          
        Scanner input = new Scanner (System.in);        
        System.out.println("Hello! What is your age?");
        String age  = input.next();   
        System.out.println("Cool " + age + " is a great age!");
        System.out.println("Bubbye!");
        
      
        
        
               
    }
    
}
