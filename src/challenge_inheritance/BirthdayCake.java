package challenge_inheritance;

public class BirthdayCake extends Cake{
  public int getCandles() {
    return candles;
  }

  public void setCandles(int candles) {
    this.candles = candles;
  }

  int candles;

  public BirthdayCake(){
    // setFlavour("Chocolate");
    super("Chocolate");
  }
}
