package decision_structures;

import java.util.Scanner;


public class SalaryCalculator {
  public static void main(String[] args) {
    int salary = 1000;
    int bonus = 250;
    int quota = 10;

    System.out.println("How many sales did the employee make this week?");
    Scanner scanner = new Scanner(System.in);

    int sales = scanner.nextInt();

    if (sales > quota) {
      salary = salary + bonus;
    }
    else if (sales != quota) {
      System.out.println("Not sufficient!");
    }
    else {
      System.out.println("Made it!");
    }

    System.out.println("Total Salary: $" + salary);
  }
}
