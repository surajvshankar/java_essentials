package functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MapReduce {
  public static void main(String[] args){
    List<String> veggies = Arrays.asList("spinach", "cabbage", "green beans");
    veggies.stream().map(String::toUpperCase).forEach(System.out::println);

    List<Integer> nums = Arrays.asList(1, 2, 3);

    // reduce(identity, binary_operator - to accumulate the values)
    // note: reduce closes the stream
    int result1 = nums.stream().reduce(0, (a,b) -> a+b);
    System.out.println(result1);
    // Identity – an element that is the initial value of the reduction operation and the default result if the stream is empty
    result1 = nums.stream().reduce(2, (a,b) -> a+b);
    System.out.println(result1);

    String result2 = veggies.stream().sorted().reduce("", (a,b) -> a + "|" + b);
    System.out.println(result2);
    result2 = veggies.stream().sorted().reduce("Here it is more clear: ", (a,b) -> a + "|" + b);
    System.out.println(result2);

    // Collect is a terminal operation
    List<String> newList = veggies.stream().filter(v->v.contains("e")).collect(Collectors.toList());
    System.out.println(newList);
  }
}
