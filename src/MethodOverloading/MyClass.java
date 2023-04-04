package MethodOverloading;

public class MyClass {
	 
	    public int myMethod(int x) {
	    
	        int ans=x+1;
	    	System.out.println(ans);
	    	return ans;
	    	
	        
	    }

	    public double myMethod(int x, double y) {
	        return x + y;
	    }
	
	public static void main(String[] args) {
		
		MyClass mc = new MyClass();
		mc.myMethod(5);
	}

}
