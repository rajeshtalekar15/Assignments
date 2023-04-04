package Loops;

public class Q10 {
	public static void main(String[] args) {
		int rev=0,rem,num=332;
		int temp=num;
		
		while(num!=0) {
			rem = num%10;  //656%10 = 6 //65%10=5 //6%10=6
			rev = rev*10+rem;  //6 //65 //656
			num=num/10;
		}
		
		
		if(temp==rev) {
			System.out.println(rev+" is a Palindrome number");
		}
		else
		{
			System.out.println(rev+" is not a Palindrome number");
		}
}
}