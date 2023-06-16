package loops;
import java.util.Scanner;

public class AddNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int num1 = 0;
    int num2 = 0;
    do{
      System.out.println("Pass me a number to add to the last one: " + num1);
      num2 = scanner.nextInt();
      System.out.println("Total: " + (num1 + num2));
      num1 = num2;
    }while(num2 > 0);
    scanner.close();
  }
}
