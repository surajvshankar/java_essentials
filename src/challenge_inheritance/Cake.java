package challenge_inheritance;

public class Cake {
  public String getFlavour() {
    return flavour;
  }

  public double getPrice() {
    return price;
  }

  public void setFlavour(String flavour) {
    this.flavour = flavour;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  private String flavour;
  private double price;

  public Cake() {
    this("Vanilla");
  }
  public Cake(String flavour) {
    setFlavour(flavour);
    setPrice(9.99);
  }
}
