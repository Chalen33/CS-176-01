package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   Used to test the BlankLinesRemover class.
*/
public class InputOutputFiles
{
   public static void main(String[] args) throws FileNotFoundException {
	   
	  boolean finish = false;
	  do {

		  try {
			  Scanner fileInput = new Scanner(System.in);
		      System.out.println("Please enter the path to open the input file for example C:\\Downloads\\lines.txt : ");
			  String answer = fileInput.nextLine();

      File inputFile = new File(answer);
      PrintWriter outputFile = new PrintWriter("outlines.txt");

      Scanner in = new Scanner(inputFile);    
      while (in.hasNext()) {  
      String what =in.next();
      outputFile.println(what);
      }
      
      in.close();
      outputFile.close();
      finish=true;

   }
		  catch(Exception FileNotFoundException) {
			  System.out.println("File is not found, please try again.");
   }
}
	  while (finish!=true);
   }
}