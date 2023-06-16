package decision_structures;
import java.util.Scanner;

public class SwitchExpression {
  public static void main(String[] args) {
    System.out.println("Enter a grade:");
    Scanner scanner = new Scanner(System.in);

    String grade = scanner.next();
    scanner.close();

//    String message = switch(grade) {
//      case "A", "a" -> "Good job!";
//      case "B" -> "That's fine!";
//      default -> "Don't know what you mean!";
//    };

//    System.out.println(message);
  }
}
