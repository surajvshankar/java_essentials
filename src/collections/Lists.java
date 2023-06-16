package collections;

import java.util.ArrayList;
import java.util.List; // Inherits from Collection iface

public class Lists {
  public static void main(String[] args){
    List list = new ArrayList();
    list.add("one");
    list.add("two");
    list.add("three");
    list.add("one");
    list.add(2);

    System.out.println(list);
    System.out.println(list.get(3));

    System.out.println(list.indexOf("one"));
    System.out.println(list.lastIndexOf("one"));

    list.set(2, "four");
    System.out.println(list);

    List anotherList = list; // pointer

    anotherList.remove("one");
    System.out.println(list);

    list.add(0, "one");
    System.out.println(list);

    list.remove(2);
    System.out.println(list);
  }
}
