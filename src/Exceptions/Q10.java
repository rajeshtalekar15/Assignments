package Exceptions;

public class Q10 {
	public static void main(String[] args) {
        try {
            // Attempt to load a non-existent class
            Class.forName("java.util.Exception");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }
}
