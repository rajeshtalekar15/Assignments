package Loops;

public class Q9 {
	public static void main(String[] args) {
		 
		 int num=6,temp=0;
		 
		 for (int i = 2; i <= num-1; i++) {   
			if(num%i==0) {                    
				temp = temp+1;                 
			}
			
			
		}
		 if(temp>0){                            //1>0=True
				System.out.println("Not a Prime Number");
			}
			else {
				System.out.println("Prime Number");
			}
	}
}
