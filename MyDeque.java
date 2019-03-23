public class MyDeque<E>{
  public E[] data;
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
      if(data[start] != null) {
        return 1;
      }
      return 0;
    }
    else {
      if(start > end) {
        return end + 1 + data.length - start;
      }
      else {
        return end - start + 1;
      }
    }
  }

  public String toString(){
	  System.out.println(start);
	  System.out.println(end);
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
	if(data[end] != null) {
        out += data[end] + " ";
    }
    out += "}";
    return out;
  }

  @SuppressWarnings("unchecked")
  private void resize() {
    E[] temp = (E[])new Object[data.length * 2 + 1];
    for(int i = 0; i < data.length;) {
      temp[i] = data[start+i];
      if(start+i == data.length-1) {
        start = i*-1-1;
      }
	  i++;
    }
    start = 0;
    end = data.length-1;
    size = size();
    data = temp;
  }

  public void addFirst(E element){
    if((start == 0 && end == data.length-1) || start == end+1) {
      resize();
    }
    if(start == 0) {
      if(data[start] != null) {
        start = data.length-1;
        data[start] = element;
      }
      else {
        data[start] = element;
      }
    }
    else {
      start--;
      data[start] = element;
    }
    size = size();
  }
  
  public void addLast(E element){
	if((start == 0 && end == data.length-1) || start == end+1) {
      resize();
    }
    if(end == data.length-1) {
      if(data[end] != null) {
        end = 0;
        data[end] = element;
      }
      else {
        data[end] = element;
      }
    }
    else {
      end++;
      data[end] = element;
    }
    size = size();
  }
  
  






}
