package objects;

public class Rectangle {
  private int length;
  private int breath;

  public Rectangle() {
    System.out.println("Running default constructor");
  }
  public Rectangle(int length, int breath) {
    setLength(length);
    setBreath(breath);
  }
  public int getLength() {
    return length;
  }
  public void setLength(int length) {
    this.length = length;
  }
  public int getBreath() {
    return breath;
  }
  public void setBreath(int breath) {
    this.breath = breath;
  }
  public int calculatePerimeter(){
    return (2 * getLength()) + (2 * getBreath());
  }
  public int calculateArea(){
    return getLength() * getBreath();
  }
}
