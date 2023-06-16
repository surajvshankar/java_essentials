package polymorphism;

public class Dog extends Animal{
  public void fetch() {
    System.out.println("fetch is fun");
  }
  @Override
  public void makeSound(){
    System.out.println("woof");
  }
  @Override
  public void food(){
    System.out.println("chicken");
  }
}
