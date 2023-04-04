package Strings;

public class Q11 {
	public static void main(String args[]) {
		String str = "java string split method by javatpoint";
		String[] words = str.split("\\s");

		for (String w : words) {
			System.out.println(w);
		}
	}
}
