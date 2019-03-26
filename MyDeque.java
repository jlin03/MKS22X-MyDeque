import java.util.NoSuchElementException;
public class MyDeque<E>{
  private E[] data;
  public int size, start, end;

  @SuppressWarnings("unchecked")
  public MyDeque() {
    data = (E[])new Object[10];
    size = 0;
    start = 0;
    end = 0;
  }

  @SuppressWarnings("unchecked")
  public MyDeque(int initialCapacity) {
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

  public String toString() {
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

  public void addFirst(E element) {
	if(element == null) {
	  throw new NullPointerException();
	}
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
  
  public void addLast(E element) {
	if(element == null) {
	  throw new NullPointerException();
	}
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
	  if(data[end] != null) {
		end++;
		data[end] = element;
	  }
	  else {
		data[end] = element;
	  }
    }
    size = size();
  }
  
  public E removeFirst() {
	if(size == 0) {
	  throw new NoSuchElementException();
	}
	E out = data[start];
	data[start] = null;
	if(start == data.length-1) {
		if(start != end) {
			start = 0;
		}
	}
	else {
		if(start != end) {
			start++;
		}
	}
	size = size();
	return out;
  }
  
  public E removeLast() {
	if(size == 0) {
	  throw new NoSuchElementException();
	}
	E out = data[end];
	data[end] = null;
	if(end == 0) {
		if(start != end) {
			end = data.length-1;
		}
	}
	else {
		if(start != end) {
			end--;
		}
	}
	size = size();
	return out;
  }
  
  public E getFirst() {
	if(size == 0) {
	  throw new NoSuchElementException();
	}
	return data[start];
  }
  
  public E getLast() {
	if(size == 0) {
	  throw new NoSuchElementException();
	}
	return data[end];
  }
  
  






}
