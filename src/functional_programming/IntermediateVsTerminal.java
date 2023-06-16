package functional_programming;

import java.util.Arrays;
import java.util.List;


public class IntermediateVsTerminal {
  public static void main(String[] args){
    List<String> veggies = Arrays.asList("spinach", "cabbage", "green beans");

    IntermediateVsTerminal iVsT = new IntermediateVsTerminal();
    iVsT.intermediateOperation(veggies);
    iVsT.terminalOperation(veggies);
  }
  protected void intermediateOperation(List<String> values) {
    Boolean test = values.stream().anyMatch(f -> f.contains(" "));
    System.out.println(test);
    test = values.stream().anyMatch(f -> f.contains("z"));
    System.out.println(test);

    test = values.stream().allMatch(f -> f.contains("a"));
    System.out.println(test);
    test = values.stream().allMatch(f -> f.contains(" "));
    System.out.println(test);
  }
  protected void terminalOperation(List<String> values) {
    // forEach is the Terminal Operation --- IMPORTANT
    values.stream().filter(f -> f.contains(" ")).forEach(System.out::println);
  }
}
