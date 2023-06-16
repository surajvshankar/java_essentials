package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class EnhancedForLoops {
  public static void main(String[] args) {
    Set set = new HashSet();
    set.add("orange");
    set.add("mango");
    set.add("apple");
    set.add("grapes");

    for (Object eachElement : set) {
      String stringify = (String) eachElement;
      System.out.println(stringify);
    }

    // OR Force type:

    Set<String> set2 = new HashSet<>();
    set2.add("orange");
    set2.add("mango");
    set2.add("apple");
    set2.add("grapes");

    for (String eachElmnt : set2) {
      System.out.println(eachElmnt);
    }

    Map<String, Integer> map = new HashMap<>();
    map.put("orange", 5);
    map.put("apple", 4);
    map.put("mango", 7);
    map.put("grapes", 3);

//    for (Map.Entry mapEntry : map) { // Will FAIL - not an iterable
    for (Map.Entry mapEntry : map.entrySet()) {
      System.out.println(mapEntry.getKey() + " --- " + mapEntry.getValue());
    }
  }
}
