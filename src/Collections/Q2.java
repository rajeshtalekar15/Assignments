package Collections;

import java.util.HashMap;
import java.util.Set;

public class Q2 {
	public static void main(String[] args) {
		HashMap<Integer, String> studentMap = new HashMap<>();

		studentMap.put(101, "James");
		studentMap.put(102, "Raj");
		studentMap.put(103, "Alex");
		studentMap.put(104, "Tom");
		studentMap.put(105, "Emily");
		studentMap.put(106, "Oliver");
		studentMap.put(107, "Sophie");
		studentMap.put(108, "Grace");
		studentMap.put(109, "Lucas");
		studentMap.put(110, "Isabella");

		System.out.println("Student HashMap: " + studentMap);

		// Q1
		studentMap.put(111, "Mark");
		System.out.println("Updated Student HashMap: " + studentMap);

		// Q2
		String value = studentMap.get(104);
		System.out.println("Value of key 104: " + value);

		// Q3
		HashMap<Integer, String> copy = new HashMap<>(studentMap);
		System.out.println("Clone of Student HashMap: " + copy);

		// Q4
		int key = 104;
		if (studentMap.containsKey(key)) {
			System.out.println("Key " + key + " is present in the HashMap.");
		} else {
			System.out.println("Key " + key + " is not present in the HashMap.");
		}

		// Q5
		String valueName = "Raj";
		if (studentMap.containsValue(valueName)) {
			System.out.println("Value " + valueName + " is present in the HashMap.");
		} else {
			System.out.println("Value " + valueName + " is not present in the HashMap.");
		}

		// Q6
		if (studentMap.isEmpty()) {
			System.out.println("The HashMap is empty.");
		} else {
			System.out.println("The HashMap is not empty.");
		}

		// Q7
		System.out.println("The size of the HashMap is: " + studentMap.size());

		// Q8
		Set<Integer> keys = studentMap.keySet();

		// Printing all the keys in the HashMap
		System.out.print("The keys in the HashMap are: ");
		for (int keyz : keys) {
			System.out.print(keyz);
			System.out.print(" ");
		}
		// Q9
		studentMap.remove(103);
		System.out.println();
		System.out.println("The updated HashMap is: " + studentMap);

		// Q10
		HashMap<Integer, String> copyMap = new HashMap<>();
		copyMap.putAll(studentMap);

		System.out.println("The copied HashMap is: " + copyMap);

	}
}
