package Static;

public class Q3 {
	static int a = 1, b = 2;

	int c = 3, d = 4;

	public void insMethodA() {
		System.out.println("Static variable: " + Q3.a + " and "+Q3.b);
	}

	public static void main(String[] args) {
		Q3 obj = new Q3();
		obj.insMethodA();

	}

}
