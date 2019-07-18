import java.util.Scanner;

public class Homework4 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Bai1();
		System.out.print("Input A: ");
		int a = sc.nextInt();
		System.out.print("Input B: ");
		int b = sc.nextInt();
		Bai2(a, b);
		MergeSort.run();
		QuickSort.run();
	}

	static void Bai2(int a, int b) {
		int U = theGreatestCommonDivisor(a, b);
		System.out.print(a + " va " + b);
		if (U == 1)
			System.out.println(" la hai so nguyen to cung nhau");
		else
			System.out.println(" khong la hai so nguyen to cung nhau");
	}

	static int theGreatestCommonDivisor(int a, int b) {
		if (a == 0 || b == 0)
			return a + b;
		while (a != b) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}

		}
		return a;
	}

	static void Bai1() {
		System.out.println("===Bai1+Bai3===");
		System.out.println("Cac so nguyen to < 100000 la:");
		boolean[] isPrime = new boolean[100000]; // all false
		// false = so nguyen to , true = khong
		isPrime[0] = true;
		isPrime[1] = true;
		for (int i = 0; i < isPrime.length; i++) {
			if (isPrime[i] == false) {
				for (int j = i * 2; j < isPrime.length; j = j + i) {
					isPrime[j] = true;
				}
			}
		}
		for (int i = 0; i < isPrime.length; i++) {
			if (isPrime[i] == false)
				System.out.print(i + "\t");
		}
		System.out.println("===end of excercise 1===");
	}

}
