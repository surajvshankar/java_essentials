package loops;
import java.util.Scanner;

public class Cashier {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("How many items would you like to enter:");
    int noOfItems = scanner.nextInt();

    int total = 0;

    for (int i=0; i < noOfItems; i++) {
      System.out.println("Enter the price of item number: " + (i + 1) + " :");
      int costPerItem = scanner.nextInt();
      total = total + costPerItem;
    }
    scanner.close();
    System.out.println("Total cost: " + total);
  }
}
