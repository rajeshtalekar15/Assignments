package AccessModifiers;

import java.util.Arrays;

public class Q1 {
	private int privateField;

	private void privateMethod() {
		System.out.println("This is a private method.");
	}

	public static void main(String[] args) {
		Q1 obj = new Q1();
		obj.privateField = 10;
		System.out.println("The private field is: " + obj.privateField);
		obj.privateMethod();
	}

}
