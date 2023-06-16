package text_processing;

public class ReverseString {
  public static void main(String[] args){
    String string = new String("this and that");
    System.out.println(reverse_string(string));
  }
  static String reverse_string(String string) {
    int i = string.length();
    String reversed = "";
    while (i > 0){
      reversed = reversed + string.charAt(--i);
    }
    return reversed;
  }
}
