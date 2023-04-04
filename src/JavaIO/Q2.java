package JavaIO;

import java.io.FileOutputStream;

public class Q2 {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\EclipseProjects\\JalaAcademy\\src\\JavaIO\\Files\\text.txt");
			String str = "Java";
			byte b[] = str.getBytes();// converting string into byte array
			fout.write(b);
			fout.close();
			System.out.println("Success.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
