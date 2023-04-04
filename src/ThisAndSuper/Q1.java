package ThisAndSuper;

import java.util.Arrays;

public class Q1 {

	int a = 1;
	String str = "Java";

	public void method() {
		System.out.println(this.a);
		System.out.println(this.str);
	}

	public static void main(String[] args) {
		Q1 obj = new Q1();
		obj.method();
	}

}
