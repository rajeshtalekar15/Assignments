package Arrays;

import java.util.Arrays;

public class Q13 {
	static int findSecondLargest(int a[], int n) {

		Arrays.sort(a);

		int second_largest = 0;
		for (int i = n - 2; i >= 0; i--) {

			if (a[i] != a[n - 1]) {
				second_largest = a[i];
				break;
			}
		}

		return second_largest;
	}

	public static void main(String[] args) {
		int a[] = { 12, 35, 1, 10, 34, 1 };
		int n = a.length;

		int answer = findSecondLargest(a, n);

		System.out.println("The second largest element in the array is: " + answer);

	}
}
