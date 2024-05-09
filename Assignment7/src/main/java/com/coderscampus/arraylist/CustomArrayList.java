package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
    private Object[] items = new Object[10];
    private int size = 0;

   
    
    public boolean checkBounds(int index, Object element) {
        // Check if index is within bounds
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return true;
    }

    public boolean add(int index, Object element) {
        // Check if index is within bounds
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        
        // Check if array is full, increase capacity if necessary
        if (size == items.length) {
            increaseCapacity();
        }
        
     // Shift elements to the right to make space for the new item
        for (int i = size - 1; i >= index; i--) {
            items[i+1] = items[i];
        }

        
        // Add the new item at the specified index
        items[index] = element;
        size++;
        
        return true;
    }


    public boolean addAtPosition(int index, T element) {
        // Check if index is valid
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        // Check if array is full, increase capacity if necessary
        if (size == items.length) {
            increaseCapacity();
        }

        // Shift elements to the right to make space for the new item
        for (int i = size - 1; i >= index; i--) {
            items[i + 1] = items[i];
        }

        // Add the new item at the specified index
        items[index] = element;
        size++;

        return true;
    }


    public boolean remove1(int index) {
        // Check if the index is valid
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        
        // Shift elements to the left to remove the element at the specified index
        for (int i = index; i < size - 1; i++) {
            items[i] = items[i + 1];
        }


        
        // Set the last element to null and decrement the size
        items[size - 1] = null;
        size--;
        
        return true;
    }




    private void increaseCapacity() {
        if (getSize() == items.length) {
            // Double the size of the array
            items = Arrays.copyOf(items, items.length * 2);
        }
    }


    @Override
    public boolean add(Object element) {
        // TODO: Implement adding an item without specifying the index
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int index) {
        // Check if index is within bounds
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        // Return the element at the specified index
        @SuppressWarnings("unchecked")
        T item = (T) items[index];
        return item;
    }

    @Override
    public void add(int i, int j) {
        // TODO: Implement adding an item with two integer parameters
    }

	@Override
	public boolean remove(int i) {
		// TODO Auto-generated method stub
		return false;
	}
}
