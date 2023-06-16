package inheritance;

public class Employee extends Person {
  public Employee() {
    // Default constructor in Person must exist OR this constructor should explicitly call another constructor from Superclass.
    System.out.println(var1 + " var, accessible");
    System.out.println(var2 + " var, accessible");
    // System.out.println(var3 + " var Not accessible");
    System.out.println(var4 + " var, accessible");
  }
  public Employee(String name) {
    super(name); // Must be before anything else
    System.out.println("Employee constructor: " + name);
  }
  public static void main(String[] args){
    Employee em = new Employee();
    Employee em1 = new Employee("Suraj");
    em1.var1 = "ChangedHigher";
    em1.var2 = "ChangedHigher";
    // em1.var4 = "Cannot change";
  }
}
