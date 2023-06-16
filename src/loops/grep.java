package loops;
import java.util.Scanner;

public class grep {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a string to search against:");
    String searchAgainst = scanner.next();
    System.out.println("Enter a string to search for:");
    String searchFor = scanner.next();

    boolean found = false;

    for (int i=0; i < searchAgainst.length(); i++){
      for (int j=0; j < searchFor.length(); j++){
        if (searchAgainst.charAt(i + j) != searchFor.charAt(j)) {
          found = false;
          break;
        }
        else {
          found = true;
        }
      }
      if (found) {
        System.out.println("Found at index: " + i);
      }
    }
    scanner.close();
  }
}
