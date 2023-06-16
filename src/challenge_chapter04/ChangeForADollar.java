package challenge_chapter04;
import java.util.Scanner;

public class ChangeForADollar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of pennies: ");
    int pennies = scanner.nextInt();
    System.out.println("Enter the number of nickels: ");
    int nickels = scanner.nextInt();
    System.out.println("Enter the number of dimes: ");
    int dimes = scanner.nextInt();
    System.out.println("Enter the number of quarters: ");
    int quarters = scanner.nextInt();

    scanner.close();

    int total = pennies + nickels * 5 + dimes * 10 + quarters * 25;
    int dollar = 100;

    if (total == dollar) {
      System.out.println("You win!");
    }
    else if (total < dollar){
      System.out.println("You lose! \nYou are " + (dollar - total) + " cents short.");
    }
    else {
      System.out.println("You lose! \nYou are " + (total - dollar) + " cents over.");
    }
  }
}
