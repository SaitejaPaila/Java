import java.util.*;
import java.io.*;
public class Main {

   
    public static void main(String[] args) throws FileNotFoundException {
        //declaring variables
        int count = 0;
        int total = 0;
        int average = 0  ;
       
        // Opening file for reading
        File file = new File("examscores.txt");
        
        Scanner fileInput = new Scanner(file);
        
        //output file
        PrintWriter output = new PrintWriter("examscore.txt");
        
        //Reading file
        
        while(fileInput.hasNextInt()){
            int examScores = fileInput.nextInt();
            count++;
            total = total + examScores;
            average = total/count;
            
        }
        output.println("The average is: " + average);
        
        output.close();
        fileInput.close();

