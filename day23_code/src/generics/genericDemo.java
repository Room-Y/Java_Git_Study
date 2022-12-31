package generics;

import java.io.StringReader;
import java.util.Arrays;

/**
 * @author: Java_cmr
 * @Date: 2022/12/31 - 2:26
 */
public class genericDemo<E> {
    Object[] obj = new Object[10];
    int size;

    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index){
        return (E)obj[index];
    }

    public String toString(){
        return Arrays.toString(obj);
    }
}
