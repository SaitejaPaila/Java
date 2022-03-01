
package dicegame;

import java.util.*;
public class Dicegame {

    
    public static void main(String[] args) {
        System.out.println("Welcome to dice match!");
        Scanner input = new Scanner (System.in);
        System.out.print("What's the player 1 first name?: ");
        String player1 = input.next();
        System.out.print("What's the player 2 first name?:");
        String player2 = input.next();
        System.out.println("Here we go!");
        
        Random randNum = new Random();
        int rand1 = randNum.nextInt(6) + 1;
        int rand2 = randNum.nextInt(6) + 1;
        System.out.println( player1 +" " + rand1 +" " + rand2);
        int rand3 = randNum.nextInt(6) + 1;
        int rand4 = randNum.nextInt(6) + 1;
        System.out.println(player2 + " " + rand3 +" " + rand4);
        System.out.println("And the winner is.....");
        if((rand1+rand2) > (rand3+rand4)){
            System.out.println(player1 + " with a total of " + " " + (rand1+rand2) );
        }
        else if((rand1+rand2) == (rand3+rand4)){
            System.out.println("It is a tie between" + " " + player1 + "and" + player2);
        }
        else{
            System.out.println(player2 + " with a total of " + " " + (rand3+rand4));
        }
        System.out.print("Enter 1 to play again or 0 to quit: ");
        int num = input.nextInt();
        while(num !=0){
             System.out.println("Here we go!");
        
        Random randNum1 = new Random();
        int rand5 = randNum1.nextInt(6) + 1;
        int rand6 = randNum1.nextInt(6) + 1;
        System.out.println( player1 +" " + rand5 +" " + rand6);
        int rand7 = randNum1.nextInt(6) + 1;
        int rand8 = randNum1.nextInt(6) + 1;
        System.out.println(player2 + " " + rand7 +" " + rand8);
        System.out.println("And the winner is....");
        if((rand5+rand6) > (rand7+rand8)){
            System.out.println(player1 + " with a total of " + " " + (rand5+rand6) );
        }
        else if((rand5+rand6) == (rand7+rand8)){
            System.out.println("It is a tie between" + " " + player1 + "and" + player2);
        }
        else{
            System.out.println(player2 + " with a total of " + " " + (rand7+rand8));
        }
        System.out.print("Enter 1 to play again or 0 to quit: ");
        num = input.nextInt();      
        }
        System.out.println("Thanks for playing good bye!");
       
         
        
       
    }
    
}
