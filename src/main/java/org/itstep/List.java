package org.itstep;

import org.itstep.exception.EmptyListException;
import org.itstep.exception.FullListException;

import java.util.Arrays;

class List<T> {
    private T[] obj;
    //    static final int sizeMax = 10;
    private int size = -1;
    private int cur = -1;

    public List(int size) {
        cur = 0;
        this.size = size;
        obj = (T[]) (new Object[size]);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(T item) throws FullListException { // тут потрібно декларувати перевіряємий ексепшен
        if (cur < size) {
//            obj[cur++] = item;
            cur++;
            obj[cur - 1] = item;

        } else if (cur == size) {
            // тут потрібно викинути ексепшен
            throw new FullListException();
        }
    }

    public void removeLast() throws EmptyListException {
        if (cur >= 1) {
            cur--;
            obj[cur] = null;
//        obj[--cur] = null;
        } else {
            // тут потрібно викинути ексепшен
            throw new EmptyListException();            
        }
    }

    public void printArray() {
        for (int i = 0; i < obj.length; i++) {
            System.out.println("obj[" + i + "] = " + obj[i]);
        }
    }


}


