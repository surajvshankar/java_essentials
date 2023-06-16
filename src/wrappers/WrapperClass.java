package wrappers;

public class WrapperClass {
  public static void main(String[] args) {
    int primitiveInt = -300;
    String stringInt = "-300";
    Integer intWrapper = new Integer(stringInt);
    System.out.println(intWrapper);
    System.out.println(Integer.compare(intWrapper, primitiveInt));
    System.out.println(intWrapper.doubleValue());
    System.out.println(intWrapper.floatValue());
  }
}
