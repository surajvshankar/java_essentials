package functional_programming;

import java.util.Arrays;


public class Streams {
  public static void main(String[] args){
    int[] nums = {1, 2, 3, 4, 5};

    Arrays.stream(nums).forEach(n -> System.out.println(n + 1 + " "));
    Arrays.stream(nums).parallel().forEach(n -> System.out.println(n + 1 + " "));
  }
}
