import java.util.*;
public class Driver {
  public static void main(String[] args) {
    MyDeque<Integer> test = new MyDeque<Integer>();
    test.addFirst(1);
    System.out.println(Arrays.toString(test.data));
    System.out.println(test);
    System.out.println(test.size());
    test.addFirst(2);
    System.out.println(Arrays.toString(test.data));
    System.out.println(test);
    System.out.println(test.size());
    test.addFirst(3);
    System.out.println(Arrays.toString(test.data));
    System.out.println(test);
    System.out.println(test.size());
    test.addFirst(4);
    System.out.println(Arrays.toString(test.data));
    System.out.println(test);
    System.out.println(test.size());
    test.addFirst(5);
    System.out.println(Arrays.toString(test.data));
    System.out.println(test);
    System.out.println(test.size());
    test.addFirst(6);
    System.out.println(Arrays.toString(test.data));
    System.out.println(test);
    System.out.println(test.size());
    test.addFirst(7);
    System.out.println(Arrays.toString(test.data));
    System.out.println(test);
    System.out.println(test.size());


  }

}
