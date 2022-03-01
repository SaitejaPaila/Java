
import java.util.*;
import java.io.*;
public class Main {

   
    public static void main(String[] args) throws FileNotFoundException {
        //declaring variables
        int integer = 0;
        String animal = "";
        int i = 0;
        int j = 0;
        
        int[] numArray = new int[11];
        String[] mammalArray = new String[16];
        
        //Opening file to read
        File file = new File("arrayData.txt");
        Scanner fileInput = new Scanner(file);
        
        while(fileInput.hasNextInt()){
            integer = fileInput.nextInt();
            numArray[i] = integer;
            i++;
            
        }
        while(fileInput.hasNext()){   
            animal = fileInput.nextLine();
            mammalArray[j] = fileInput.next();
            j++;
            
        }
        for(int ind = 10; ind >= 0; ind--){
            System.out.print(numArray[ind] + " ");
        }
        
        System.out.println("");
        for(int x = 0; x < numArray.length; x++){
            if(numArray[x] < 0){
                System.out.print(numArray[x] + " ");
            }
        }
        
        System.out.println("");
        for(int y = 0; y < numArray.length; y++){
            if(y%2 == 0){
                System.out.print(numArray[y] + " ");
            }
        }
            
        
        System.out.println("");
        for(String mammal: mammalArray){
            System.out.println(mammal);
        }
        System.out.println("");
        for(String mam: mammalArray){
            if((mam.charAt(0) == 'H'|| mam.charAt(0) == 'I'||mam.charAt(0) == 'J'||mam.charAt(0) =='K'||mam.charAt(0)== 'L'||mam.charAt(0) =='M'||mam.charAt(0) =='N'|| mam.charAt(0) == 'O'||mam.charAt(0) == 'P'||mam.charAt(0) == 'Q'|| mam.charAt(0) =='R'|| mam.charAt(0) =='S'||mam.charAt(0) =='T'||mam.charAt(0) =='U'||mam.charAt(0) =='V'||mam.charAt(0) =='W'||mam.charAt(0) =='X'||mam.charAt(0) == 'Y'||mam.charAt(0) =='Z')){
                System.out.println(mam);
            }
        }
        
        fileInput.close();
    }
    
}
