
package populationcalculation;

import java.util.Scanner;
public class populationcalculation {

    
    public static void main(String[] args) {
        int current_population = 312032486 ;
        int one_year = 24 * 3600 * 365;
        int new_birth = one_year/7;
        int death = one_year/13;
        int new_immigrant = one_year/45;
        int new_population = new_birth + new_immigrant - death;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of years: ");
        int n = input.nextInt();
        System.out.println("The population for " + n + " years is: " +(current_population + (new_population * n))) ;
    }
    
}
