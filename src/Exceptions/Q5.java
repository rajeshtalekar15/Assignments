package Exceptions;

public class Q5 {

	public static void main(String[] args) {
		int[] a = new int[5];
		try {
			a[10] = 10;

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException: Array length is "+a.length+".");
		}
	}
}
