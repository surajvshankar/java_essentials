package text_processing;
import java.util.Scanner;

public class PasswordValidator {
  public static void main(String[] args) {
    String username = "johndoe";
    String oldPassword = "ABC_1234";

    Scanner scanner = new Scanner(System.in);
    boolean valid;

    do {
      System.out.println("Please enter a new password: ");
//      String newPassword = scanner.next();
      String newPassword = scanner.nextLine();

      valid = validatePassword2(username, oldPassword, newPassword);
    } while(!valid);
  }
  static boolean validatePassword(String username, String oldPassword, String newPassword){
    int minSize = 8;
    if (username.equals(newPassword)) {
      System.out.printf("Error: New password should not be the same as the username!%n");
      return false;
    }
    if (newPassword.length() < minSize) {
      System.out.printf("Error: New password needs to be %d characters long!%n", minSize);
      return false;
    }
    if (oldPassword.equals(newPassword)) {
      System.out.printf("Error: New password needs to Not be the same as the old password!%n");
      return false;
    }
    boolean upperCase = false;
    boolean specialChar = false;
    int cpA = "A".codePointAt(0);
    int cpZ = "Z".codePointAt(0);
    int cpa = "a".codePointAt(0);
    int cpz = "z".codePointAt(0);
    int cp0 = "0".codePointAt(0);
    int cp9 = "9".codePointAt(0);
    for (int i = 0; i<newPassword.length(); i++) {
      if (newPassword.codePointAt(i) >= cpA && newPassword.codePointAt(i) <= cpZ){
        upperCase = true;
      } else if (newPassword.codePointAt(i) >= cpa && newPassword.codePointAt(i) <= cpz
          || newPassword.codePointAt(i) >= cp0 && newPassword.codePointAt(i) <= cp9 ){
        continue;
      } else {
        specialChar = true;
      }
      if (upperCase && specialChar) {
        return true;
      }
    }
    if (!upperCase) {
      System.out.printf("Error: New password needs to contain an Uppercase character!%n");
    }
    if (!specialChar) {
      System.out.printf("Error: New password needs to contain a Special character!%n");
    }
    return false;
  }
  static boolean validatePassword2(String username, String oldPassword, String newPassword){
    int minSize = 8;
    if (newPassword.toLowerCase().contains(username.toLowerCase())) {
      System.out.printf("Error: New password should not be the same as the username!%n");
      return false;
    }
    if (newPassword.length() < minSize) {
      System.out.printf("Error: New password needs to be %d characters long!%n", minSize);
      return false;
    }
    if (oldPassword.equals(newPassword)) {
      System.out.printf("Error: New password needs to Not be the same as the old password!%n");
      return false;
    }
    if (newPassword.equals(newPassword.toLowerCase())){
      System.out.printf("Error: New password needs to contain an Uppercase character!%n");
      return false;
    }
    if (newPassword.matches("[a-zA-Z0-9]+")) {
      System.out.printf("Error: New password needs to contain a Special character!%n");
      return false;
    }
    return true;
  }
}
