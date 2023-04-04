package ThisAndSuper;

public class Q2A extends Q2 {

	
	public void method() {
		System.out.println(super.a);
		System.out.println(super.str);
	}
	
	public static void main(String[] args) {
		Q2A obj = new Q2A();
		
		obj.method();
	}
}
