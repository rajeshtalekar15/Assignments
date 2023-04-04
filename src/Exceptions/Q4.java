package Exceptions;

public class Q4 {

	public static void main(String[] args) {

		int[] a = new int[5];
		int b = 1, c = 0,result;
		try {
			a[6] = 10;
			result=b/c;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
