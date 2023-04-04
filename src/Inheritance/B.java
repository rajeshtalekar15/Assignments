package Inheritance;

public class B extends A {
	int value = 20;
	public void methodOne() {
		System.out.println("Class B method one");
		
	}
	public void methodTwo() {
		System.out.println("Class B method two");
		
	}
	@Override
	public void methodThree() {
		System.out.println("Class B method three");
		super.methodThree();
	}
}
