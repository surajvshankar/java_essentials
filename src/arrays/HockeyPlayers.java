package arrays;

public class HockeyPlayers {
  public static void main(String[] args) {
    String[] players = new String[3];
    players[0] = "this";
    players[1] = "that";

    int length = players.length;
    while(--length >= 0) {
      System.out.println(players[length]);
    }

    String[] players2 = {"this", "that"};

    System.out.println(players2[1].equals("that"));
  }
}
