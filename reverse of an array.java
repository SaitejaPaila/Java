import java.util.*; 
public class Reverse {
public static void main(String[] args){   
    int[] my_array1 = {
            2016,2037,2082,2089,2495,1010,1572,1996,2002,1832,1762,1278};
  System.out.println("Original array : "+Arrays.toString(my_array1));  
   for(int i = 0; i < my_array1.length / 2; i++)
  {
    int temp = my_array1[i];
    my_array1[i] = my_array1[my_array1.length - i - 1];
    my_array1[my_array1.length - i - 1] = temp;
  }
    System.out.println("Reverse array : "+Arrays.toString(my_array1));
 }
}
