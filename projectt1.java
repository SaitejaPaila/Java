
package project1;
import java.util.*;
import java.io.*;
import javax.swing.*;

public class projectt1 {
    public static void main(String[] args)throws FileNotFoundException {
        
        //Declaring an array
        String [] stock = new String[7];
        String [] maxStock = new String[7];
        String [] minStock = new String[7];
        
        //Declaring variables
        String info;
        double max = 0;
        double min = 100;
        double value;
        double tranTotal1 = 0;
        double tranTotal2 = 0;
        double volTotal = 0;
        double volume;
        String ticker;
        double count = 0;
        
        
        //Allow user to choose file
        JFileChooser myChooser = new JFileChooser();
        myChooser.showOpenDialog(null);
        File file = myChooser.getSelectedFile();
        Scanner fileInput = new Scanner(file);
        
        //read file
        while(fileInput.hasNext()){
            info = fileInput.nextLine();
            stock = info.split(",");
            value = Double.parseDouble(stock[5]);
            volume = Double.parseDouble(stock[6]);
            ticker = stock[1];
            volTotal = volTotal + volume;
            count ++;
            
            if("CHK".equals(ticker)){
                tranTotal1++;
            }
            
            if("PCLN".equals(ticker)){
                tranTotal2++;
            }
            
           if(value > max){
                max = value;
                maxStock = stock;
            }
            
            if(value < min){
                min = value;
                minStock = stock;
            }
        }
        
        System.out.println("Standard and Poor's Data");
        System.out.println("");
        printMintoScreen(minStock, (long)(tranTotal1));
        System.out.println("");
        printMaxToScreen(maxStock, (long)(tranTotal2));
        System.out.println("");
        findandPrintAverage((long)(count), (long)(volTotal));
        
        fileInput.close();
        
        //create output file
        PrintWriter output = new PrintWriter("SP500output.txt");
        
        //print to output file
        output.println("Standard and Poor's Data");
        output.println("");
        printMinToFile(minStock, output, (long)(tranTotal1));
        output.println("");
        printMaxToFile(maxStock, output, (long)(tranTotal2) );
        output.println(" ");
        findandPrintAverageToFile((long)(count), (long)(volTotal), output);
        
        //closes file
        output.close();
        
        
    }
    
    //Method tp print min data to screen
    public static void printMintoScreen(String[] minParts, long count){
        System.out.println("Minimum Closing Stock Information");
        System.out.printf("Date:  %16s\n",  minParts[0]);
        System.out.printf("Ticker: %10s\n", minParts[1]);
        System.out.printf("Open price: %7s\n", minParts[2]);
        System.out.printf("High price: %7s\n", minParts[3]);
        System.out.printf("Low price: %8s\n",  minParts[4]);
        System.out.printf("Closing price: %s\n", minParts[5]);
        System.out.printf("Volume: %15s\n", minParts[6]);
        System.out.println( minParts[1] + " stock transactions: " + count);
                 
        }
    
    //method to print max data to the screen
    public static void printMaxToScreen(String[] maxParts, long count){
        System.out.println("Maximum Closing Stock Information");
        System.out.printf("Date: %17s\n", maxParts[0]);
        System.out.printf("Ticker: %11s\n", maxParts[1]);
        System.out.printf("Open price: %7s\n", maxParts[2]);
        System.out.printf("High price: %10s\n", maxParts[3]);
        System.out.printf("Low price: %11s\n", maxParts[4]);
        System.out.printf("Closing price: %s\n", maxParts[5]);
        System.out.printf("Volume: %13s\n", maxParts[6]);
        System.out.println( maxParts[1] + " stock transactions: " + count);
        
    }
    
    ////Method to find and print average volumes
    public static void findandPrintAverage(long count, long total){
        long average = total/count;
        System.out.printf( "Number of stock: %10s\n", count);
        System.out.println( "Stock volume totals: " + total);
        System.out.printf( "Average volume: %12s\n", average);
    }
    
    //Method to print min data to file
    public static void printMinToFile(String[] minParts, PrintWriter file, long count){
        file.println("Minimum Closing Stock Information");
        file.printf("Date:  %16s\n",  minParts[0]);
        file.printf("Ticker: %10s\n", minParts[1]);
        file.printf("Open price: %7s\n", minParts[2]);
        file.printf("High price: %7s\n", minParts[3]);
        file.printf("Low price: %8s\n",  minParts[4]);
        file.printf("Closing price: %s\n", minParts[5]);
        file.printf("Volume: %15s\n", minParts[6]);
        file.println( minParts[1] + " stock transactions: " + count);
    }

    //Method to print max data to file
    public static void printMaxToFile(String[] maxParts, PrintWriter file, long count){
        file.println("Maximum Closing Stock Information");
        file.printf("Date: %17s\n", maxParts[0]);
        file.printf("Ticker: %11s\n", maxParts[1]);
        file.printf("Open price: %7s\n", maxParts[2]);
        file.printf("High price: %10s\n", maxParts[3]);
        file.printf("Low price: %11s\n", maxParts[4]);
        file.printf("Closing price: %s\n", maxParts[5]);
        file.printf("Volume: %13s\n", maxParts[6]);
        file.println( maxParts[1] + " stock transactions: " + count);
    }

    //method to print average data to file
    public static void findandPrintAverageToFile(long count, long total, PrintWriter file){
        long average = total/count;
        file.printf( "Number of stock: %10s\n", count);
        file.println( "Stock volume totals: " + total);
        file.printf( "Average volume: %12s\n", average);
    }
}
