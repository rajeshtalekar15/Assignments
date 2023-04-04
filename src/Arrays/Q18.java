package Arrays;

import java.util.Arrays;

public class Q18 {
	public static class Main {
		public static int removeDuplicates(int array[], int n) {
			if (n == 0 || n == 1) {
				return n;
			}
			int[] temp = new int[n];
			int j = 0;
			for (int i = 0; i < n - 1; i++) {
				if (array[i] != array[i + 1]) {
					temp[j++] = array[i];
				}
			}
			temp[j++] = array[n - 1];
			for (int i = 0; i < j; i++) {
				array[i] = temp[i];
			}
			return j;
		}

		public static void main(String[] args) {
			int array[] = { 25, 28, 18, 29, 25, 18, 29, 28, 25, 18 };
			Arrays.sort(array);
			int length = array.length;
			length = removeDuplicates(array, length);
			for (int i = 0; i < length; i++)
				System.out.print(array[i] + " ");
		}
	}
}
