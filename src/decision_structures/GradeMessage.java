package decision_structures;
import java.util.Scanner;

public class GradeMessage {
   public static void main(String[] args){
     System.out.println("Please enter a grade: ");
     Scanner scanner = new Scanner(System.in);

     String grade = scanner.next();
     scanner.close();
     String message = "";

     switch (grade) {
       case "A":
       case "a":
         message = "Good job!";
         break;
       case "B":
         message = "That's fine!";
         break;
       case "b":
         break;
       default:
         message = "Don't know what you mean!";
     }

     System.out.println(message);
  }
}
