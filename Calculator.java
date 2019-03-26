import java.util.*;
public class Calculator {

  public static double eval(String s) {
    MyDeque<Double> storage = new MyDeque<Double>();
    String[] chain = s.split(" ");
    for(int i = 0; i < chain.length; i++) {
      if(isDouble(chain[i])) {
        storage.addLast(Double.parseDouble(chain[i]));
      }
      else {
        double two = storage.removeLast();
        double one = storage.removeLast();
        storage.addLast(operate(chain[i],one,two));
      }
    }
    return storage.getLast();

  }

  public static boolean isDouble(String d) {
    try {
      Double.parseDouble(d);
      return true;
    }
    catch(Exception e) {
      return false;
    }
  }

  public static double operate(String operator, double one, double two) {
    if(operator.equals("*")) {
      return one*two;
    }
    if(operator.equals("/")) {
      return one/two;
    }
    if(operator.equals("+")) {
      return one+two;
    }
    if(operator.equals("-")) {
      return one-two;
    }
    if(operator.equals("%")) {
      return one%two;
    }
    return 0;
  }



}
