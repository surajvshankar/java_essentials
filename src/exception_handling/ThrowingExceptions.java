package exception_handling;

public class ThrowingExceptions {
  public static void main(String[] args) {
    ThrowingExceptions obj = new ThrowingExceptions();
    System.out.println(obj.evaluator(25));
    // obj.evaluator(41);
    try {
      obj.customExceptionEvaluator(-1);
    } catch (NegativeInputException e){
      e.printStackTrace();
    }
  }
  protected boolean evaluator(int num) {
    if (num > 40){
      // IllegalArgumentException is a subclass of runtime exception, therefore it is an Unchecked Exception
      throw new IllegalArgumentException("Number was greater than 40");
    }
    return true; // moot
  }
  protected boolean customExceptionEvaluator(int num) throws NegativeInputException {
    if (num < 0){
      //  NegativeInputException is a Checked exception, therefore the method should let the caller know
      // that this method might raise this exception - IMPORTANT - with the "throws" in line 21
      // (also the calling method will have to handle it, accordingly - line 8
      throw new NegativeInputException();
    }
    return true; // moot
  }
}
