import java.util.Arrays; 
public class string{
public static void main(String[] args){   
    
    
            
    String[] my_array1 = {
            "Williams",
            "Joshua",
            "Shawn",
            "Divaly",
            "Cristina",
            "Spencers"
        };        
    System.out.println("Original string  array : "+Arrays.toString(my_array1));
    Arrays.sort(my_array1);
    System.out.println("Sorted string array : "+Arrays.toString(my_array1));
    
   
    }
}
