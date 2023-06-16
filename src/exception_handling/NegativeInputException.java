package exception_handling;

public class NegativeInputException extends Exception{
  NegativeInputException(){
    this("Input must be greater than or equal to 0");
  }

  NegativeInputException(String message){
    super(message);
  }
}
