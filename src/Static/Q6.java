package Static;

public class Q6 {
	static int a=1, b=2;

	int c=3, d=4;

	public void insMethodA() {
		System.out.println("Instance Method A");
	}

	public void insMethodB() {
		System.out.println("Instance Method B");
	}

	public static void staticMethodA() {
		System.out.println("Static Method A");
	}

	public static void staticMethodB() {
		System.out.println("Static Method B");
	}

	public static void main(String[] args) {
		System.out.println("Static variables:"+Q6.a+" and "+ Q6.b);
		Q6 obj = new Q6();
		System.out.println("Instance variables:"+obj.c+" and "+ obj.d);
	}

}
