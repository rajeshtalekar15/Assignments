package Collections;

import java.util.HashSet;

public class Q3 {
	public static void main(String[] args) {
		// Creating a HashSet object with String elements
		HashSet<String> stringSet = new HashSet<>();

		// Adding elements to the HashSet
		stringSet.add("A");
		stringSet.add("B");
		stringSet.add("C");
		stringSet.add("D");
		stringSet.add("E");
		stringSet.add("F");
		stringSet.add("G");
		stringSet.add("H");
		stringSet.add("I");
		stringSet.add("J");

		System.out.println("HashSet elements: " + stringSet);
	
		// Checking if an element is in the HashSet
	      String searchElement = "A";
	      if (stringSet.contains(searchElement)) {
	         System.out.println(searchElement + " is in the HashSet");
	      } else {
	         System.out.println(searchElement + " is not in the HashSet");
	      }

	      // Removing an element from the HashSet
	      String removeElement = "J";
	      if (stringSet.remove(removeElement)) {
	         System.out.println(removeElement + " was removed from the HashSet");
	      } else {
	         System.out.println(removeElement + " was not found in the HashSet");
	      }

	      // Printing the HashSet size to the console
	      System.out.println("The size of the HashSet is: " + stringSet.size());

	      // Creating a copy of the HashSet
	      HashSet<String> copySet = new HashSet<>(stringSet);

	      // Clearing the HashSet
	      stringSet.clear();

	      // Printing the original and copied HashSets to the console
	      System.out.println("The original HashSet is now empty: " + stringSet);
	      System.out.println("The copied HashSet is still the same: " + copySet);
	   }

}
