package collections;

import java.util.LinkedList;
import java.util.Queue; // Inherits from Collection iface


public class Queues {
  public static void main(String[] args) {
    Queue queue = new LinkedList();
    queue.add("one");
    queue.add(2);
    queue.add("three");
    queue.add("four");

    System.out.println(queue);

//    var obj = queue.remove();
    System.out.println(queue.remove());

    System.out.println(queue.peek());
  }
}
