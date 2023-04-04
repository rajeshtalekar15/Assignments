package Static;

public class Q5 {

	static int a, b;

	int c, d;

	public void insMethodA() {
		staticMethodA();
	}
	public void insMethodB() {
		staticMethodB();
	}



	public static void staticMethodA() {
		System.out.println("Static Method A");
	}

	public static void staticMethodB() {
		System.out.println("Static Method B");
	}

	public static void main(String[] args) {
		Q5 obj = new Q5();
		obj.insMethodA();
		obj.insMethodB();
		
		
	 
	 
	}

}
