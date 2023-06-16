package abstraction;

public class ShapeTester {
  public static void main(String[] args){
    //Shape shape = new Shape(); //cannot be instantiated
    Shape shape = new Rectangle(5, 7);
    System.out.println(shape.calculateArea());
  }
}
