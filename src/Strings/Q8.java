package Strings;

public class Q8 {
	public static void main(String[] args) {

		String str1 = "Java World";
		String str2 = "Java World";

		if (str1.equalsIgnoreCase(str2)) {

			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
		
		System.out.println(str1.startsWith("Java"));
		System.out.println(str1.endsWith("World"));
		System.out.println(str1.compareTo(str2));
		
		 
		
		

	}
}
