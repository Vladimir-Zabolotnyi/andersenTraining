package org.andersen.task1;

import java.util.*;

public class CustomArrayListImpl<E> implements List<E> {

    private static final int DEFAULT_INIT_CAPACITY = 10;

    private int size;
    Object[] array;


    public CustomArrayListImpl() {
        this(DEFAULT_INIT_CAPACITY);
    }

    public CustomArrayListImpl(int initCapacity) {
        if (initCapacity < 1) throw new IllegalArgumentException();
        array = new Object[initCapacity];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) return i;
            }
        }
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int lastIndexOf = -1;
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (array[i] == null) lastIndexOf = i;
            }
        }
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) lastIndexOf = i;
        }
        return lastIndexOf;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public boolean add(E e) {
        add(size, e);
        return true;
    }

    @Override
    public void add(int index, E element) {
        if (index < 0) throw new IllegalArgumentException();
        if (size == array.length) {
            array = Arrays.copyOf(array, size + 1);
        }
        System.arraycopy(array,index,array,index+1,size-index);
        array[index] = element;
        size = size + 1;
    }

    public E remove(int index) {
        if (index < 0 || index > size - 1) throw new IllegalArgumentException();
        final E elementToRemove = (E) array[index];
        System.arraycopy(array, index + 1, array, index, size - 1 - index);
        size = size - 1;
        return elementToRemove;
    }

    @Override
    public E get(int index) {
        if (index > size - 1) throw new IllegalArgumentException();
        if (index < 0) throw new IllegalArgumentException();
        return (E) array[index];
    }

    @Override
    public E set(int index, E element) {
        if (index > size - 1) throw new IllegalArgumentException();
        if (index < 0) throw new IllegalArgumentException();
        array[index] = element;
        return (E) array[index];
    }

    @Override
    public boolean remove(Object o) {
        remove(indexOf(o));
        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
            size = 0;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size));
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }


}
