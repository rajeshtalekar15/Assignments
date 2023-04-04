package JavaIO;

import java.io.FileInputStream;

public class Q1 {

	public static void main(String args[]) {
		try {
			FileInputStream fis = new FileInputStream("C:\\EclipseProjects\\JalaAcademy\\src\\JavaIO\\Files\\text.txt");
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			fis.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
