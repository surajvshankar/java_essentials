package collections;

import java.util.HashSet;
import java.util.Set; // Inherits from Collection iface

public class Sets {
  public static void main(String[] args){
    Set set = new HashSet();
    set.add("apple");
    set.add("orange");
    set.add("mango");
    set.add("apple");
    set.add(4);

    // Not ordered, but unique
    System.out.println(set);

    System.out.println("Contains? " + set.contains(4));

    set.remove("tokyo"); // No error
    System.out.println(set.size());

    // Set immutable = Set.of("one", "two", "three");
    // System.out.println(immutable);
    // immutable.add("four");

  }
}
