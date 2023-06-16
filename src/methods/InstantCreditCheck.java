package methods;
import java.util.Scanner;

public class InstantCreditCheck {
  static int qualifyingSalary = 25000;
  static int qualifyingCreditScore = 700;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your salary:");
    double salary = scanner.nextDouble();
    System.out.println("Enter your credit score:");
    double creditScore = scanner.nextDouble();
    scanner.close();
    if (isQualified(salary, creditScore)) {
      System.out.println("Credit approved!");
    }
    else {
      System.out.println("Credit Denied!");
    }
  }
  static boolean isQualified(double salary, double creditScore) {
    if (salary >= qualifyingSalary && creditScore >= qualifyingCreditScore) {
      return true;
    }
    else {
      return false;
    }
  }
}
