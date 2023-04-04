package Exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Q12 {
	public static void main(String[] args) {
		try {
			// Attempt to write to a file that is read-only
			File file = new File("C:\\EclipseProjects\\JalaAcademy\\src\\Exceptions\\Java.txt");
			FileWriter writer = new FileWriter(file, true);

		} catch (IOException e) {
			System.out.println("An I/O error occurred.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
