package AbstractClass;

public class Q4 extends Q1{

	@Override
	public void absMethod() {
		System.out.println("Abstract method");
	}
	
	public static void main(String[] args) {
		Q4 obj = new Q4();
		obj.method();
	}

}
