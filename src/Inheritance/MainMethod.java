package Inheritance;

public class MainMethod {

	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();

		a1.methodOne();
		a1.methodTwo();
		a1.methodThree();

		System.out.println();

		b1.methodOne();
		b1.methodTwo();
		b1.methodThree();

		System.out.println();

		c1.methodOne();
		c1.methodTwo();
		c1.methodThree();

		System.out.println();

		A a2 = new B();
		System.out.println("Intance variable:"+a2.value);

	}
}
