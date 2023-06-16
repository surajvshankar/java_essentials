package objects;

public class HomeAreaCalulator {
  public static void main(String[] args) {
    Rectangle room1 = new Rectangle();
    room1.setLength(40);
    room1.setBreath(30);
    System.out.println(room1.calculateArea());

    Rectangle room2 = new Rectangle(50, 80);
    System.out.println(room2.calculateArea());
  }
}
