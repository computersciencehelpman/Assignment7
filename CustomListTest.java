package com.coderscampus.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;

import com.coderscampus.arraylist.CustomArrayList;


public class CustomListTest {
	
	 @Test
	    public void testAdd() {
		 CustomArrayList<Integer> list = new CustomArrayList<>();

	        
	        // Test adding an item to the list
	        assertTrue(list.add(5));
	        assertTrue(list.add(1));
	        assertTrue(list.add(2));
	        assertTrue(list.add(3));
			 
	       
	

}
	
	 
	 @Test
	 public void testAddAtPosition() {
	     // Create a new CustomArrayList
	     CustomArrayList<Integer> list = new CustomArrayList<>();

	     // Test adding items at specific positions
	     list.add(0, 10); // Adding 10 at position 0
	     list.add(1, 20); // Adding 20 at position 1

	     // Check if the elements are added at the correct positions
	     assertEquals(Integer.valueOf(10), list.get(0), "Element at position 0 should be 10");
	     assertEquals(Integer.valueOf(20), list.get(1), "Element at position 1 should be 40");

	     
	     // Verify the size of the list after additions and replacements
	     assertEquals(2, list.getSize(), "Size of the list should be 2 after additions and replacements");
	 }

	 
	 @Test
	 public void testRemoveItem() {
		 
		 CustomArrayList<Integer> list = new CustomArrayList<>();

		 
		// Add some elements to the list
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 
		// Remove an element at index 1
		 Integer removed = list.remove(1);

		 
		// Check if the removal was successful
		 assertTrue(removed != null);
		 
		 // Optionally, you can check the state of the list after removal
		    // For example, you can check the size of the list
		 assertEquals(2, list.getSize());
		 
		// You can also check if the removed element is no longer in the list
		 assertFalse(list.get(1).equals(2));



 }
 
}