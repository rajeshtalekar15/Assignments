package JavaIO;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Q8 {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\EclipseProjects\\JalaAcademy\\src\\JavaIO\\Files\\txtwrite.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("Java");

			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
