package inheritance;

public class Inheritancechecker {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle();
    Square square = new Square();

    square.VsOverload();
    square.VsOverload("a param");
  }
}
