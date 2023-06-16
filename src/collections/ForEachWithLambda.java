package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ForEachWithLambda {
  public static void main(String[] args){
    forEach_WithLamda_and_List();
    System.out.println();
    forEach_WithLamda_and_Map();
  }
  public static void forEach_WithLamda_and_List() {
    List<String> fruits = new ArrayList<String>();
    fruits.add("orange");
    fruits.add("mango");
    fruits.add("apple");
    fruits.add("grapes");

    fruits.forEach(f -> System.out.println(f));
    System.out.println();
    fruits.forEach(System.out::println);

    System.out.println();
    fruits.forEach(f -> {
      int i = 0;
      i++;
      f = i + ". fruit: " + f; // i will always be 1!
      System.out.println(f);
    });
    System.out.println();
    System.out.println(fruits);
  }

  public static void forEach_WithLamda_and_Map(){
    Map<String, Integer> fruitsAndPrice = new HashMap<>();
    fruitsAndPrice.put("orange", 23);
    fruitsAndPrice.put("mango", 24);
    fruitsAndPrice.put("apple", 22);
    fruitsAndPrice.put("grapes", 25);

    fruitsAndPrice.forEach((k,v) -> System.out.println(k + ":" + v));
  }
}
