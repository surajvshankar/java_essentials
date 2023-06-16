package exception_handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class TryCatch {
  public static void main(String[] args){
    File file = new File("/root/test.txt");
    try{
      file.createNewFile(); // Throws a Checked exception (IOException) - outside try/catch will fail compilation.
    } catch (IOException e) {
      System.out.println("The error was:");
      System.out.println(e);
      System.out.println(e.getMessage());
      System.out.println(e.getStackTrace());
      System.out.println();
      e.printStackTrace();
    }

    Scanner scanner = new Scanner(System.in);
    scanner.nextDouble(); // Throws an Unchecked exception (InputMismatchException - if input is a String) - will not be caught at compile time.

    //Runtime exception and all it's subclasses are Unchecked Exceptions.
  }
}
