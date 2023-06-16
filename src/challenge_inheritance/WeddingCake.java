package challenge_inheritance;

public class WeddingCake extends Cake{
  public int getTiers() {
    return tiers;
  }

  public void setTiers(int tiers) {
    this.tiers = tiers;
  }

  public WeddingCake() {
    super("Almond");
  }
  int tiers;

}
