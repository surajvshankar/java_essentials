package inheritance;

public class Rectangle {
  protected int width;
  protected int length;
  protected int sides = 4;
  public int getWidth() {
    return width;
  }
  public int getLength() {
    return length;
  }
  public int getSides() {
    return sides;
  }
  public void setWidth(int width) {
    this.width = width;
  }
  public void setLength(int length) {
    this.length = length;
  }
  public void setSides(int sides) {
    this.sides = sides;
  }

  public Rectangle() {}
  public Rectangle(int width, int length){
    setWidth(width);
    setLength(length);
  }
  public int calculatePerimeter() {
    return 2 * length + 2 * width;
  }

  public void VsOverload(String params) {
    System.out.println("I am a Rectangle: " + params);
  }
}
