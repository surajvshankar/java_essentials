package challenge_chapter05;
import java.util.Random;

public class RollTheDieGame {
  public static void main(String[] args){
      iteration4();
  }
   static void iteration1() {
     Random random = new Random();
     int toWin = 20;
     int gameSpace = 1;
     for (int i=1; i<6; i++) {
      System.out.println("You are on game space: " + gameSpace);
      int die = random.nextInt(6) + 1;
      System.out.println("Draw " + i + ":" + die);
      gameSpace = gameSpace + die;
      if (gameSpace == toWin) {
        System.out.println("You won within " + i + " tries");
        break;
      }
      else if (gameSpace > toWin) {
        System.out.println("You lost - you went over the number of Game Spaces!");
        break;
      }
    }
    if (gameSpace < toWin) {
      System.out.println("You lost - you are " + (toWin - gameSpace) + " Game Spaces short!");
    }
  }
  static void iteration2() {
    Random random = new Random();
    int toWin = 20;
    int gameSpace = 0;
    for (int i = 1; i < 6; i++) {
      int die = random.nextInt(6) + 1;
      gameSpace = gameSpace + die;
      if (gameSpace == toWin) {
        System.out.println("Roll #" + i + ": You've rolled a " + die + ". You are on space: " + gameSpace + ". Congrats, you win!");
        break;
      } else {
        System.out.println(
            "Roll #" + i + ": You've rolled a " + die + ". You are now on space: " + gameSpace + " and have " + (toWin - gameSpace) + " more to go.");
      }
    }
  }
  static void iteration3() {
    Random random = new Random();
    int toWin = 20;
    int gameSpace = 0;
    for (int i = 1; i < 6; i++) {
      int die = random.nextInt(6) + 1;
      gameSpace = gameSpace + die;
      System.out.print("Roll #" + i + ": You've rolled a " + die + ". ");
      if (gameSpace == toWin) {
        System.out.print("You are on space: " + gameSpace + ". Congrats, you win!\n");
        break;
      } else {
        System.out.print("You are now on space: " + gameSpace + " and have " + (toWin - gameSpace) + " more to go.\n");
      }
    }
  }
  static void iteration4() {
    Random random = new Random();
    int toWin = 20;
    int gameSpace = 0;
    int tries = 5;
    for (int i = 1; i <= tries; i++) {
      int die = random.nextInt(6) + 1;
      gameSpace = gameSpace + die;
      System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));
      if (gameSpace == toWin) {
        System.out.print(String.format("You are on space: %d. Congrats, you win!\n", gameSpace));
        break;
      } else if (gameSpace > toWin){
        System.out.print(String.format("Unfortunately, that takes you past %d spaces. You lose!\n", toWin));
        break;
      } else if (i == tries){
        System.out.print(String.format("You are now on space: %d. Unfortunately, you didn't make it to all %d spaces. You lose!\n", gameSpace, toWin));
      } else {
        System.out.print(String.format("You are now on space: %d and have %d more to go.\n", gameSpace, (toWin - gameSpace)));
      }
    }
  }
}
