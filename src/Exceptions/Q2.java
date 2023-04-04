package Exceptions;

public class Q2 {
	static int a = 1;
	static int b = 0;

	public static void main(String[] args) {
		try {

			int result = a / b;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

	}
}
