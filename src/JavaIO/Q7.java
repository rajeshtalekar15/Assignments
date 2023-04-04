package JavaIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Q7 {
	public static void main(String[] args) {
		try {
			File F = new File("C:\\EclipseProjects\\JalaAcademy\\src\\JavaIO\\Files\\txtread.txt");
			FileReader fr = new FileReader(F);  
			BufferedReader br = new BufferedReader(fr);

			System.out.println(br.readLine());	

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
