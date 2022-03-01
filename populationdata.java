
package populationdata;
import java.util.*;
import java.io.*;


public class Population_data {

    
    public static void main(String[] args) throws FileNotFoundException {
        int count = 0;
        
   
        File file = new File("population by zip.txt");
        Scanner fileInput = new Scanner(file);
        PrintWriter output = new PrintWriter("dataSwitch.txt");
        
        while(fileInput.hasNextInt()){
           int zipCode = fileInput.nextInt();
           int population = fileInput.nextInt();
           count ++;
           
           output.print(population + "   " + zipCode);
           output.println();
        }
        
        output.println();
        output.println("The file had " + count + " lines");
        fileInput.close();
        output.close();
        System.out.println("The file had " + count + " lines");
    }
    
}
