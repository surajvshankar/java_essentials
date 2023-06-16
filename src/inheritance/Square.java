package inheritance;

public class Square extends Rectangle{
  @Override
  public int calculatePerimeter() {
    return sides * length;
  }

  public void VsOverload() {
    System.out.println("I am a Square");
  }
}
