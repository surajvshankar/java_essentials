package inheritance;

public class Person {
  public String var1 = "public";
  protected String var2 = "protected";
  private String var3 = "private";
  final public String var4 = "final";
  public Person(){
    System.out.println("default constructor");
  }
  public Person(String name){
    System.out.println("constructor with the name: " + name);
  }
}
