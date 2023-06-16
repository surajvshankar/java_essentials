package abstraction;

public class Rectangle extends Shape {
  public double getLength() {
    return length;
  }

  public double getBreadth() {
    return breadth;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public void setBreadth(double breadth) {
    this.breadth = breadth;
  }

  private double length;
  private double breadth;

  @Override
  public double calculateArea() {
    return length * breadth;
  }
  public Rectangle(int length, int breadth) {
    setBreadth(breadth);
    setLength(length);
  }
}
