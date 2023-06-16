package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map; // Does NOT inherit from Collection iface
import java.util.Set;


public class Maps {
  public static void main(String[] args){
    Map map = new HashMap();
    map.put("key1", "one");
    map.put(2, "value2");
    map.put("key3", "three");
    map.put("key1", 1); // Overwrite the existing value
    map.putIfAbsent("key3", 3);

    System.out.println(map);
    System.out.println(map.get("key3"));
    System.out.println(map.get("key4")); // null

    System.out.println(map.containsKey(2));
    System.out.println(map.containsKey("key4"));
    System.out.println(map.containsValue(1));
    System.out.println(map.containsValue("three"));

    map.remove("key1");
    System.out.println(map);
    map.remove("key4");
    System.out.println(map);

    Set mapEnteries = map.entrySet(); // Convert to Set
    System.out.println(mapEnteries);
    Set mapKeys = map.keySet(); // Just the keys
    System.out.println(mapKeys);
    Collection values = map.values();
    System.out.println(values);
  }
}
