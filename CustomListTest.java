package com.coderscampus.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.coderscampus.arraylist.CustomArrayList;
import com.coderscampus.arraylist.CustomList;

public class CustomListTest {
	
	 @Test
	    public void testAdd() {
	        CustomList<Integer> list = new CustomArrayList<>();
	        
	        // Test adding an item to the list
	        assertTrue(list.add(5));
	        assertTrue(list.add(1));
	        assertTrue(list.add(2));
	        assertTrue(list.add(3));
			 
	       
	

}
	 @Test
	 public void testCheckBounds() {
		 CustomList<Integer> list = new CustomArrayList<>();
		 
		 //Add some elements to the list
		 list.add(10);
		 list.add(20);
		 list.add(30);
		 
		 //Attempt to access an element at an out-of-bounds index
		 assertThrows(IndexOutOfBoundsException.class, () -> {
			 list.get(2);//This should throw IndexOutOfBoundsException
		 });
		 
	 }
	 
	 @Test
	 public void AddAtPosition() {
	     CustomList<Integer> list = new CustomArrayList<>();
	     
	     // Test adding an item at a specific position
	     list.add(0, 10); // Adding 10 at position 0
	     list.add(1, 20); // Adding 20 at position 1
	     
	     // Check if the elements are added at the correct positions
	     assertEquals(Integer.valueOf(10), list.get(0)); // Check if 10 is at position 0
	     assertEquals(Integer.valueOf(20), list.get(1)); // Check if 20 is at position 1
	     
	     // Add a new element at position 1 to replace existing element 20
	     list.add(1, 40); // Adding 40 at position 1 (replacing existing element 20)
	     
	     // Check if the element at position 1 has been replaced correctly
	     assertEquals(Integer.valueOf(40), list.get(1)); // Check if 40 is at position 1 after replacement
	     
	     // Verify the size of the list
	     assertEquals(2, list.getSize()); // Check if the size of the list is 2 after the addition
	 }
	 
	 @Test
	 public void testRemoveItem() {
		 
		 CustomList<Integer> list = new CustomArrayList<>();
		 
		// Add some elements to the list
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 
		// Remove an element at index 1
		 boolean removed = list.remove(1);

		 
		// Check if the removal was successful
		 assertTrue(removed);
		 
		 // Optionally, you can check the state of the list after removal
		    // For example, you can check the size of the list
		 assertEquals(2, list.getSize());
		 
		// You can also check if the removed element is no longer in the list
		 assertFalse(list.get(1).equals(2));



 }


	  
	 
	 
	 
	 
	 
}