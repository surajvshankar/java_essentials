package interfaces;

public interface Product {
  String getName();
  void setName(String name);

  default int getPrice() { return -1; }
  default void setPrice(int price) {}

  static void print() {
    System.out.println("From Interface");
  }
}
