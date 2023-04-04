package Inheritance;

public class C extends B{
	int value = 30;
	public void methodOne() {
		System.out.println("Class C method one");
	}
	public void methodTwo() {
		System.out.println("Class C method two");
	}
	
	@Override
	public void methodThree() {
		System.out.println("Class C method three");
		super.methodThree();
	}
}
