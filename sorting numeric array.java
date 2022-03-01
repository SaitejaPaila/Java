import java.util.Arrays; 
public class numeric{
public static void main(String[] args){   
    
    int[] my_array1 = {
            1994,3452,1109,0234,2345,9432,8432,2213,1140};
   
    System.out.println("Original numeric array : "+Arrays.toString(my_array1));
    Arrays.sort(my_array1);
    System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
    
    
    }
}
