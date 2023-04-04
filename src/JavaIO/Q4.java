package JavaIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Q4 {
	public static void main(String[] args) throws Exception {
	    BufferedOutputStream bufferedOutput = new BufferedOutputStream(new FileOutputStream("C:\\EclipseProjects\\JalaAcademy\\src\\JavaIO\\Files\\txtwrite.txt"));
	    bufferedOutput.write("Line one".getBytes());
	    bufferedOutput.write("\n".getBytes());

	    bufferedOutput.write(65);
	    bufferedOutput.close();
	  }
}
