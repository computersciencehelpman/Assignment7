package com.coderscampus.arraylist;



public class ExampleApplication {

	public static void main(String[] args) {
		CustomArrayList<String> customList = new CustomArrayList<>();

		System.out.println("Elements in the array:");
		
		customList.add("1");
		customList.add("2");
		customList.add("3");
		customList.add("4");
		customList.add("5");
		customList.add("6");
		customList.add("7");
		customList.add("8");
		customList.add("9");
		customList.add("10");
		customList.add("11");
		customList.add("13");
		customList.add("25");
		customList.add("15");
		
		for (int i = 0; i < customList.getSize(); i++) {
		    System.out.println(customList.get(i));
		}

		
		
	}
	
}
