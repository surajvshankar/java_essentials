package challenge_chapter03;

import java.util.Scanner;


public class FillInTheBlanks {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Please provide a season of the year:");
    String season = scanner.next();

    System.out.println("Please provide a whole numer:");
    int number = scanner.nextInt();

    System.out.println("Please provide an adjective:");
    String adjective = scanner.next();

    scanner.close();

    System.out.println("On an " + adjective + " " + season + " day,\n" + "I drink a minimum of " + number + " cups\nof coffee.");
  }
}
