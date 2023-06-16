package polymorphism;

public class Cat extends Animal{
  @Override
  public void makeSound(){
    System.out.println("meow");
  }
  @Override
  public void food(){
    System.out.println("fish");
  }
}
