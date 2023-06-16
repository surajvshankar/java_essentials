package exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;


public class TryWithResources {
  public static void main(String[] args){
    File file = new File("/Users/surshank/Documents/data/Java2023/java_essentials/src/exception_handling/test.txt");
    File outputFile = new File("/root/scratch.txt");

    try(
        // Finally no longer required - whatever is declared here will be closed
        // == with open(file) as fd:
        Scanner scanner = new Scanner(file);
        PrintWriter printWriter = new PrintWriter(outputFile);
        ) {
      while (scanner.hasNext()) System.out.println(scanner.nextDouble());
    } catch (FileNotFoundException | InputMismatchException e) {
      e.printStackTrace();
    }
  }
}
