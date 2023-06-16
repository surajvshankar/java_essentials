package polymorphism;
import java.util.Scanner;

public class Zoo {
  public static void main(String[] args) {
    Dog rocky = new Dog();
    rocky.fetch();
    rocky.makeSound();

    Animal sasha = new Cat();
    sasha.makeSound();
    sasha = new Dog();
    sasha.makeSound();

    if (sasha instanceof Animal) {
      System.out.println("sasha is an instanceof Animal");
    }
    if (sasha instanceof Dog) {
      System.out.println("sasha is an instanceof Dog");
    }
    if (!(sasha instanceof Cat)) {
      System.out.println("sasha is Not an instanceof Cat");
    }

    //sasha.fetch(); //--- Does not exist - since, Animal and not Dog
    ((Dog) sasha).fetch();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the animal:");
    String nameOfAnimal = scanner.next();
    Animal animal2 = new Animal();

    if (nameOfAnimal.toLowerCase().equals("dog")) {
      animal2 = new Dog();
    } else if (nameOfAnimal.toLowerCase().equals("cat")) {
      animal2 = new Cat();
    }
    animal2.food();

//    Animal tommy = new Dog();
//    if (tommy instanceof Dog tommyTheDog) {
//      tommyTheDog.fetch();
//    }
  }
}
