import java.util.*;
import java.io.*;
public class strings {
    public static void main(String[] args) throws FileNotFoundException {
         File file = new File("people.txt");
          Scanner fileInput = new Scanner(file);
          
          while(fileInput.hasNext()){
              String people = fileInput.nextLine();
              System.out.println(people);
          }
          
          fileInput.close();
        
    }
    
}

