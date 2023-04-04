package Exceptions;

public class Q6 extends Exception{
	public Q6(String message) {
        super(message);
    }
	
	public static void main(String[] args) {
		try {
			throw new Q6("My Exception");
		} catch (Q6 e) {
			System.out.println(e);
		}
	}
}
