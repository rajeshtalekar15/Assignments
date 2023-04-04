package Interfaces;

public class Q5 implements Q5InterfaceA, Q5InterfaceB {

	@Override
	public void method() {
System.out.println("Method");
	}

	public static void main(String[] args) {

		Q5 obj = new Q5();
		obj.method();
	}

}
