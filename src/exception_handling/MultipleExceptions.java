package exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MultipleExceptions {
  public static void main(String[] args) {
    File file = new File("/Users/surshank/Documents/data/Java2023/java_essentials/src/exception_handling/test.txt");
    Scanner scanner = null;

    try{
       scanner = new Scanner(file);
      while (scanner.hasNext()) {
        System.out.println(scanner.nextDouble());
      }
    } catch (FileNotFoundException e){
      System.out.printf("Couldn't find the file:\n" + e);
    } catch (InputMismatchException e){
      System.out.printf("Expected a double, Got: " + e);
    } catch (SecurityException | FileSystemAlreadyExistsException e){
      System.out.println("To demonstrate handling multiple exception in the the same way");
    } catch (Exception e){
      e.printStackTrace();
    } finally {
      if (scanner != null) {
        scanner.close();
      }
    }
  }
}
