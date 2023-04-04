package Static;

public class Q4 {
	static int a, b;

	int c, d;

	public void insMethodA() {
		System.out.println("Instance Method A");

	}

	public void insMethodB() {
		System.out.println("Instance Method B");
	}

	public static void staticMethodA(Q4 obj) {
		obj.insMethodA();
	}

	public static void staticMethodB(Q4 obj) {
		obj.insMethodB();
	}

	public static void main(String[] args) {
		Q4 obj = new Q4();
		obj.staticMethodA(obj);
		obj.staticMethodB(obj);
	}

}
