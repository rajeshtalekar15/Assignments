package AccessModifiers;

public class Q1Sub extends Q1 {

	public static void main(String[] args) {
		Q1Sub obj = new Q1Sub();
     //	obj.privateField = 20; // Can't access private field
	 // obj.privateMethod();   // Can't access private method
	}
}