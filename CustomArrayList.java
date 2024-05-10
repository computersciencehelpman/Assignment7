package com.coderscampus.arraylist;
import java.util.Arrays;

public class CustomArrayList<T> {

    private Object[] items = new Object[10];
    private int size = 0;

    public boolean add(T item) {
        if (size == items.length) {
            increaseCapacity();
        }
        items[size++] = item;
        return true;
    }

    public boolean add(int index, T item) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        if (size == items.length) {
            increaseCapacity();
        }

        for (int i = size - 1; i >= index; i--) {
            items[i + 1] = items[i];  System.out.println(items[index]);
        }
      
        items[index] = item;
        size++;

        return true;
    }

    public int getSize() {
        return size;
    }

    private void increaseCapacity() {
        items = Arrays.copyOf(items, items.length * 2);
    }

    public T get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) items[index];
    }

    
    public T remove(int index) throws IndexOutOfBoundsException {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }

            T removedItem = (T) items[index];

            for (int i = index; i < size - 1; i++) {
                items[i] = items[i + 1];
            }

            items[--size] = null;

            return removedItem;
        }
    }
