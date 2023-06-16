package functional_programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;


public class FunctionalInterfaces {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("apple", "orange");
    Consumer print = c -> System.out.println(c);

    list.forEach(print);
    print.accept("test");



    Function<Integer, Integer> square = n -> n * n;
    Function<Integer, Integer> add = n -> n + n;

    int result = square.andThen(add).apply(5);
    System.out.println(result);
  }
}
