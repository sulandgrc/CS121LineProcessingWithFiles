import java.io.*;
import java.util.*;
/**
 * Name: <your name here>
 *
 * CS 121
 *
 * Core Topics: Scanner objects that can check for/read an entire line from a file with the 
 * hasNextLine() and nextLine() methods. Scanner objects that can tokenzie a String. PrintStream objects which 
 * can write information to a file with the println method.
 */
public class LineProcessingWithFiles {

   public static void main(String[] args) throws FileNotFoundException {
  

      Scanner fileIn = new Scanner(new File("more_numbers.txt"));
     // displayTokens(fileIn);
     // displayLines(fileIn);
     //maxNumberOnLine(fileIn);

      PrintStream fileOut = new PrintStream(new File("cleaned_more_numbers.txt"));
      //cleanFile(fileIn,fileOut);
    
   }



   /**
    * This method will display the contents of a file using token-based processing
    * which means spaces are not displayed
    * @param fileIn Scanner object connected to a file
    */
   public static void displayTokens(Scanner fileIn) {
      while(fileIn.hasNext()){
         String text = fileIn.next();
         System.out.println(text);
      }
   }

   /**
    * This method will display each line in the file using line-based processing 
    * which means spaces between numbers are preserved
    * @param fileIn Scanner object connected to a file
    */
   public static void displayines(Scanner fileIn) {
      while (fileIn.hasNextLine()) {
         String line = fileIn.nextLine();
         System.out.println(line);
      }
   }

   /**
    * This method prints the largest number found on each line 
    * of the file 
    * @param fileIn Scanner object connected to a file
    */
   public static void maxNumberOnLine(Scanner fileIn) {

   }

   /**
    * This method will remove extra spaces between tokens but preserve line breaks by processing
    * the file line by line. The cleaned data is written to a PrintStream
    * object 
    * @param fileIn Scanner object connected to a file
    * @parm output PrintStream object 
    * Data Before Cleaning:
    * 100     256     78
    * 98 78 34
    * 67    55   34
    * 23   1000   1021
    * Cleaned Data:
    * 100 256 78
    * 98 78 34
    * 67 55 34
    * 23 1000 1021

    */
   public static void cleanFile(Scanner fileIn,PrintStream output) {

   }

}