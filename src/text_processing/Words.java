package text_processing;

public class Words {
  public static void main(String[] args) {
    count_and_print("hello world,     why are you here?  ");
    count_and_print2("hello world,     why are you here?  ");
  }
  static void count_and_print(String myString){
   // char[] word = new char[]{};
    String word = "";
    int noOfWords = 0;
    for(int i = 0; i < myString.length(); i++) {
      char character = myString.charAt(i);
      if (character == ' ') {
        if (word.length() != 0) {
          System.out.println("-" + word + "-");
          noOfWords = noOfWords + 1;
          //word = new char[]{};
          word = "";
        }
      } else {
        word = word + character;
      }
    }
    System.out.println("No. of words: " + noOfWords);
  }
  static void count_and_print2(String myString){
    String[] words = myString.split(" ");
    int noOfWordsNonEmpty = 0;
    for(int i = 0; i < words.length; i++) {
      if (words[i].length() > 0) {
        System.out.println("-" + words[i] + "-");
        noOfWordsNonEmpty = noOfWordsNonEmpty + 1;
      }
    }
    System.out.println("No. of words: " + noOfWordsNonEmpty);
  }
}
