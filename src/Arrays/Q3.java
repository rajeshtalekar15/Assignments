package Arrays;

public class Q3 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		int element = 2;
		int index = -1;

		int i = 0;
		while (i < numbers.length) {
			if (numbers[i] == element) {
				index = i;
				break;
			}
			i++;
		}

		System.out.println("Index of " + element + " is : " + index);
	}
}
