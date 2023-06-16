package challenge_inheritance;

public class TasteTester {
  public static void main(String[] args) {
    Cake cake = new Cake();
    cake.setPrice(29.99);
    System.out.println("Cake flavour: " + cake.getFlavour());
    System.out.println("Cake price: " + cake.getPrice());

    BirthdayCake birthdayCake = new BirthdayCake();
    System.out.println("Birthday cake flavour: " + birthdayCake.getFlavour());
    System.out.println("Birthday cake price: " + birthdayCake.getPrice());

    WeddingCake weddingCake = new WeddingCake();
    System.out.println("Wedding cake flavour: " + weddingCake.getFlavour());
    weddingCake.setFlavour("Pina Colada");
    weddingCake.setPrice(350);
    System.out.println("Wedding cake flavour: " + weddingCake.getFlavour());
    System.out.println("Wedding cake price: " + weddingCake.getPrice());
  }
}
