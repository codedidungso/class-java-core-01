import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
	static int[] array;
	static int length;
	static Scanner sc;

	public static void run() {
		System.out.println("Merge Sort");
		sc = new Scanner(System.in);
		inputArr();
		printArr();
		array = mergeSort(array);
		printArr();
	}

	private static int[] mergeSort(int[] array) {
		if (array.length == 1)
			return array;
		else {
			int mid = array.length / 2; // 1 3 5 62 66 8 8 mid = 3
			int[] left = Arrays.copyOfRange(array, 0, mid); // 1 2 5 62 
			int[] right = Arrays.copyOfRange(array, mid, array.length); // 66 8 8

			int[] sortedLeft = mergeSort(left); // 1 2 5 62
			int[] sortedRight = mergeSort(right); // 8 8 66

			return merge(sortedLeft, sortedRight); // 

		}
	}

	static int[] merge(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		for (int k = 0; k < result.length; k++) {
			if (j == b.length || (i < a.length && a[i] < b[j])) {
				result[k] = a[i++];
			} else {
				result[k] = b[j++];
			}
		}
		return result;
	}

	private static void printArr() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();

	}

	private static void inputArr() {
		System.out.print("Input array's length: ");
		length = sc.nextInt();
		array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

	}
}
