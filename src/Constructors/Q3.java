package Constructors;

public class Q3 {
	Q3() {
		System.out.println("Default constructor");
	}

	public Q3(int a) {
		System.out.print("Public constructor:");
		System.out.println(a);
	}

	private Q3(int a, String str) {
		System.out.print("Private constructor:");
		System.out.println(a + "," + str);
	}

	protected Q3(int a, int b, String str) {
		System.out.print("Protected constructor:");
		System.out.println(a + "," + b + "," + str);
	}
}
