package Loops;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        switch (num % 2) {
            case 0:
                System.out.println(num + " is even.");
                break;
        
            default:
                System.out.println(num + " is odd.");
                break;
        }
    }
}




