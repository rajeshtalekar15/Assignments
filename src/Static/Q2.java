package Static;

public class Q2 {
	static int a = 1, b = 2;

	int c = 3, d = 4;

	public static void staticMethodA(Q2 obj1) {
		System.out.println("Instance variables: " + obj1.c + " and " + obj1.d);

	}

	public static void main(String[] args) {
		Q2 obj1 = new Q2();
		staticMethodA(obj1);
	}

}
