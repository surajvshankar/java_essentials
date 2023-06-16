package gross_calculator;
import java.util.Scanner;

public class GrossPayValidator {
  public static void main(String[] args) {
    int maxHours = 40;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the no. of hrs the employee worked this week: ");
    int hoursWorked = scanner.nextInt();

    while (hoursWorked > maxHours) {
      System.out.println("Invalid input. Please ensure that the no. of hours worked this week <= " + maxHours);
      System.out.println("Enter the no. of hrs the employee worked this week: ");
      hoursWorked = scanner.nextInt();
    }
    scanner.close();
  }
}
