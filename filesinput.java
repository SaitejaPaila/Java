import java.util.*
	import java.io.*;
	public class Filesinput {

  
    public static void main(String[] args) throws FileNotFoundException{
        //declaring variables
        int i = 0;
        int j = 0;
        int total = 0;
       	 int count = 0;
        
        
        
      	  int[][] numArray2D = new int[4][3];
        
        File file = new File("2darraydata.txt");
        Scanner fileInput = new Scanner(file);
        
        while(fileInput.hasNextInt()){
            
         	   for(j = 0; j < 3;j++){
         	             int num = fileInput.nextInt();
            	   	 numArray2D[i][j] = num;
            	   		 total = total + num;
				]        
      		  count ++;
     			       }
          			  i++;
         			}
   	     fileInput.close();
            
     	   double average = ((double)(total)/(double)(count));
   		     for(int row = 0; row < numArray2D.length; row++){
   				             for(int col = 0; col < numArray2D[row].length; col++){
                				    System.out.print(numArray2D[row][col] + " ");
           					     }
         			       System.out.println("");
			        }
        
     		   System.out.println("");
 	               System.out.println("average= " + ((double)(total)/(double)(count)));
      		  System.out.println("Array values greater than average:");
	           	for(int[] row : numArray2D){
           		 for(int number : row){
             			   if((double)(number) > average){
                 			  System.out.print(number + " ");
               			 }
          			  }
    		  }
      
    }
}

