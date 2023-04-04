package AbstractClass;

public class Q1Sub extends Q1{

	@Override
	public void absMethod() {
		method();
	}
		
	public static void main(String[] args) {
		Q1Sub obj = new Q1Sub();
		obj.absMethod();
		}
}
