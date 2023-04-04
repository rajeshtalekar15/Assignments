package Exceptions;

public class Q9 {
	public static void main(String[] args) {
        int[] a = new int[2];

        try {
            a[5]=5; // This will throw an ArithmeticException
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundException: " + e.getMessage());
        }
    }
}
