package interfaces;

public interface DigitalAsset {
  void setName(String name);
  // int getName(); // Will give an error - since, signatures don't match (when Book implements Product and DigitalAsset
}
