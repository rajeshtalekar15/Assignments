package JavaIO;

import java.io.File;
import java.io.FileReader;

public class Q5 {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\EclipseProjects\\JalaAcademy\\src\\JavaIO\\Files\\txtread.txt");
			FileReader fr = new FileReader(f);
			
			for (int i = 0; i < f.length(); i++) {
				System.out.print((char)fr.read());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

}
	 
}
