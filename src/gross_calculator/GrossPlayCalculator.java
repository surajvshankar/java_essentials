package gross_calculator;

import java.util.Scanner;


public class GrossPlayCalculator {

  public static void main(String[] args) {
    System.out.println("Hello World!");

    int hours = 40;
    System.out.println("How many hours did you work?");
    Scanner scanner = new Scanner(System.in);
    hours = scanner.nextInt();

    double payRate = 25.50;
    System.out.println("What is your pay rate?");
    payRate = scanner.nextDouble();

    scanner.close();

    double grossPay = hours * payRate;
    System.out.println("Gross Pay: " + grossPay);
  }
}
