package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Q1 {

	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<String>();

		// Adding 10 string elements to ArrayList
		stringList.add("A");
		stringList.add("B");
		stringList.add("C");
		stringList.add("D");
		stringList.add("E");
		stringList.add("F");
		stringList.add("G");
		stringList.add("H");
		stringList.add("I");
		stringList.add("J");

		System.out.println("ArrayList elements: " + stringList);

		// Q1
		stringList.add("K");
		System.out.println("ArrayList elements: " + stringList);

		// Q2
		Iterator<String> itr = stringList.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
			System.out.print(" ");
		}
		System.out.println();
		// Q3
		stringList.add(5, "Java");
		System.out.println("ArrayList elements: " + stringList);

		// Q4
		stringList.remove("Java");
		System.out.println("ArrayList elements: " + stringList);

		stringList.remove(6);
		System.out.println("ArrayList elements: " + stringList);

		// Q5
		stringList.set(6, "HH");

		System.out.println("ArrayList elements: " + stringList);

		// Q6
		int index = 5;
		if (stringList.size() > index && stringList.get(index) != null) {
			System.out.println("Element at index " + index + " is " + stringList.get(index));
		} else {
			System.out.println("There is no element present at index " + index);
		}

		// Q7
		int oldIndex = 2;
		int newIndex = 5;
		if (stringList.size() > oldIndex && stringList.get(oldIndex) != null) {
			String element = stringList.remove(oldIndex);
			stringList.add(newIndex, element);
			System.out.println("Element " + element + " shifted from index " + oldIndex + " to index " + newIndex);
			System.out.println("Updated ArrayList: " + stringList);
		} else {
			System.out.println("There is no element present at index " + oldIndex);
		}
		
		//Q8
		int size = stringList.size();
        System.out.println("Size of the ArrayList is " + size);
        
        //Q9
        boolean isPresent = stringList.contains("A");
        if(isPresent==true) {
        	System.out.println("Element found.");
        }
        else {
        	System.out.println("Element not found.");
        }
        
        //Q10
        stringList.removeAll(stringList);
    	System.out.println("ArrayList elements: " + stringList);

	}
}
