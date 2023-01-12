package ss_10_dsalist.ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object elements[];

    public MyList() {
    }

    public MyList(int capacity) {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
        elements[index] = element;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void remove(int index) {

        for (int i = 0; i < index; i++) {
            elements[i]=elements[i];
            }
        elements[index]= ;
        }
    }

