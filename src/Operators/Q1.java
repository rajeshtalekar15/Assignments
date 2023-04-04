package Operators;

public class Q1 {

	int result;

	public int add(int num1, int num2) {
		result = num1 + num2;
		System.out.println(result);
		return result;
	}

	public int substract(int num1, int num2) {
		result = num1 - num2;
		System.out.println(result);
		return result;
	}

	public int multiply(int num1, int num2) {
		result = num1 * num2;
		System.out.println(result);
		return result;
	}

	public float divide(int num1, int num2) {
		result = num1 / num2;
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {

		Q1 arithmetic = new Q1();
		arithmetic.add(1, 20);
		arithmetic.substract(100, 20);
		arithmetic.multiply(20, 20);
		arithmetic.divide(100, 20);
	}
}
