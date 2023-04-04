package Strings;

public class Q6 {
public static void main(String args[]) {
		
		String Str = new String("Welcome to Java");
		
		System.out.print("Return Value :");
		System.out.println(Str.matches("Welcome(.*)"));
		
		System.out.print("Return Value :");
		System.out.println(Str.matches("(.*)to(.*)"));

		System.out.print("Return Value :");
		System.out.println(Str.matches("(.*)Java(.*)"));

	}
}
