public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque(){
    data = (E[])new Object[10];
    size = 0;
    start = 0;
    end = 0;
  }

  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
    size = 0;
    start = 0;
    end = 0;
  }

  public int size() {
    if(start == end) {
      return 0;
    }
    else {
      if(start > end) {
        return end + 1 + data.length - start;
      }
      if(start < end) {
        return end - start + 1;
      }
    }
  }

  public String toString(){
    String out = "{";
    int i = start;
    while(i != end) {
      out += data[i] + " ";
      if(i == data.length-1) {
        i = 0;
      }
      else {
        i++;
      }
    }
    out += "}";
  }



}
