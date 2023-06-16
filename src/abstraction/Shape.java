package abstraction;

public abstract class Shape {
  public abstract double calculateArea();

  // public abstract void notImplemented();
  // Then the extended class needs to be abstract - pushing the burden of implementing it further up

  public static void print() {
    System.out.println("I am an abstract!");
  }
}
