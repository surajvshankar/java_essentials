package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Iterators {
  public static void main(String[] args) {
    Set fruits = new HashSet();
    fruits.add("apple");
    fruits.add("mango");
    fruits.add("orange");
    fruits.add("grapes");

    Iterator i = fruits.iterator();
    while (i.hasNext()) {
      System.out.println(i.next());
    }

    // Since Maps are a part of Collection but does not implement the Collection iface:
    Map fruitAndCost = new HashMap();
    fruitAndCost.put("apple", "$1");
    fruitAndCost.put("mango", "$2");
    fruitAndCost.put("orange", "$3");
    fruitAndCost.put("grapes", "$4");

    Iterator i2 = fruitAndCost.entrySet().iterator(); // IMPORTANT
    while (i2.hasNext()) {
      Map.Entry entry = (Map.Entry) i2.next();
      System.out.println(entry.getKey() + "---" + entry.getValue());
    }
  }
}
