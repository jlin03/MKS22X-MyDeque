import java.util.*;
public class Calculator {

  public static double eval(String s) {
    MyDeque<Double> storage = new MyDeque<Double>();
    String[] chain = s.split(" ");
    for(int i = 0; i < chain.length; i++) {
      if(isDouble(chain[i])) {

      }

    }
    return storage.getFirst();

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


}
