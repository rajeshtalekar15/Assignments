package AbstractClass;

public class Q3 extends Q1 {
	@Override
	public void absMethod() {
		method();
	}
		
	public static void main(String[] args) {
		Q3 obj = new Q3();
		obj.absMethod();
		}
}
