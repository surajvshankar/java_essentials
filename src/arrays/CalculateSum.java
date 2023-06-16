package arrays;

public class CalculateSum {
  public static void main(String[] args) {
    System.out.println(calculateSum());
    System.out.println(calculateSum(2, 3));
    System.out.println(calculateSum(new int[]{1, 2, 3}));

    lastVariable_varargs("hello: ", 1, 2, 3);
    lastVariable_varargs("zero and not nothing: ");
  }
  static double calculateSum(int ...nums) {
    double total = 0;
    for(int i=0; i<nums.length; i++) {
      total = total + nums[i];
    }
    return total;
  }

  static void lastVariable_varargs(String saywhat, int ...nums) {
    double total = 0;
    for(int i=0; i<nums.length; i++) {
      total = total + nums[i];
    }
    System.out.println(saywhat + total);
  }
}
