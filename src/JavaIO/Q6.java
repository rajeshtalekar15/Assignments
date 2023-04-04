package JavaIO;

import java.io.File;
import java.io.FileWriter;

public class Q6 {
	public static void main(String[] args) {
		try {
			File f = new File("C:\\EclipseProjects\\JalaAcademy\\src\\JavaIO\\Files\\txtwrite.txt");
			FileWriter fw = new FileWriter(f);
			fw.write("Hiiii !!!!");
			fw.write("\n");
			fw.write("Welcome");
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

}
}




