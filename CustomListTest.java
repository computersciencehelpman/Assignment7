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
	 public void testAddIsValid() {
		 
		 CustomArrayList<Integer> list = new CustomArrayList<>();
		 
	     //Test valid scenarios
		 assertTrue(list.addIsValid(10,0), "Should be valid to add at index 0 in an empty list");
		 
		 list.add(1); //Adding element to the list
		 
		 
		 assertTrue(list.addIsValid(20,1), "Should be valid to add at index 1 in a non-empty list");
		 
		// Test invalid scenarios
		 assertFalse(list.addIsValid(null,0), "Should not be valid to add null item");
		 
		 assertFalse(list.addIsValid(30, -1), "Should not be valid to add at negative index");
		 
		 assertFalse(list.addIsValid(40, list.getSize() +1), "Should not be valid to add at index greater than size");
		 
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
	 public void testRemoveIsValid() {
		
		 CustomArrayList<Integer> list = new CustomArrayList<>();
		 
		 //Adding elements into ArayList
		 list.add(0, 10);
		 list.add(1,20);
		 list.add(2,30);
		 
		 //Test valid scenarios
		 assertTrue(list.removeIsValid(10,0), "Should be valid to remove at index 0");
		 
		// Test invalid scenarios
		assertFalse(list.addIsValid(null,0), "Should not be valid to add null item");
				 
		assertFalse(list.addIsValid(30, -1), "Should not be valid to add at negative index");
				 
		assertFalse(list.addIsValid(40, list.getSize() +1), "Should not be valid to add at index greater than size");
	 }
	 
	 @Test
	    public void testIsValidGet() {
	        CustomArrayList<Integer> list = new CustomArrayList<>();

	        // Adding elements into ArrayList
	        list.add(0, 1);
	        list.add(1, 2);
	        list.add(2, 3);

	        // Test valid scenarios
	        assertTrue(list.isValidGet(0), "Index 0 should be valid");
	        assertTrue(list.isValidGet(1), "Index 1 should be valid");
	        assertTrue(list.isValidGet(2), "Index 2 should be valid");

	        // Test invalid scenarios
	        assertFalse(list.isValidGet(-1), "Negative index should be invalid");
	        assertFalse(list.isValidGet(3), "Index equal to size should be invalid");
	        assertFalse(list.isValidGet(100), "Large index should be invalid");
	    }

	 @Test 
	 public void testIsArrayFull() {
		
		 CustomArrayList<Integer> list = new CustomArrayList<>();
		 
		 //Initially, the list should not be full
		 assertFalse(list.isArrayFull(), "List should not be full initially");
		 
		 //Add elements to fill the list to its initial capacity
		 for (int i = 0; i < 10; i++) {
			 list.add(i);
		 }
		 
		 //Now, the list should be full
		 assertTrue(list.isArrayFull(), "List should be full after adding 10 elements");
		 
		 //Add one more element to trigger the increase in capacity
		 list.add(10);
		 
		 //After increasing the capacity, the list should not be full
		 assertFalse(list.isArrayFull(), "List should not be full after increasing capacity");
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