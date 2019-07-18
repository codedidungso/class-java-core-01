import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class PhanSo implements Comparable<PhanSo> {
	int tuso;
	int mauso;

	PhanSo(int tuso, int mauso) {
		this.tuso = tuso;
		this.mauso = mauso;
	}

	@Override
	public int compareTo(PhanSo o) {
		return this.tuso * o.mauso - this.mauso * o.tuso;
	}

}

public class Lesson5 {
	static Scanner scanner = new Scanner(System.in);
	static int[] arrays = new int[10]; // global variable

	public static void main(String[] args) {
		PhanSo[] ps = new PhanSo[2];
		ps[0] = new PhanSo(1, 5);
		ps[1] = new PhanSo(1, 4);

		Arrays.sort(ps);
		System.out.println("p1: " + ps[0].tuso + "//" + ps[0].mauso);
		System.out.println("p2: " + ps[1].tuso + "//" + ps[1].mauso);

		int[] a = { 1, 4, 5, 7, 9, 13, 16, 17 };
		int[] b = { 2, 6, 7, 8, 9, 10, 14, 16, 17, 19 };
		int[] c = merge(a, b);
		System.out.print("Array A: ");
		printArr(a);
		System.out.print("Array B: ");
		printArr(b);
		System.out.print("Array C: ");
		printArr(c);

		HashMap<String, Integer> map = new HashMap<>(); // tu hoc

		int[] arrays = new int[100]; // local variable
		int kkkk = Lesson5.arrays[1]; // global variable

		System.out.println(arrays[1]);
		String s; // char[]
		s = String.valueOf(14); // s = "14"
		Integer.compare(3, 4);
		Character.isWhitespace(' ');
		// Double.NaN; // Not an Number

		Double.valueOf("3.14");
		Float.parseFloat("3.14"); // wrapper
		Integer x = 10000;
		Integer y = 10000;
		if (x.equals(y)) { // try (x==y) return false
			System.out.println("bang nhau");
		} else {
			System.out.println("khac nhau");
		}

		System.out.println(x + ":" + y);
		int aa = 10; // &aa =0xhff
		char cc = 'c';
		double xx = 1.4;
		System.out.println(aa + ":" + cc + ":" + xx);
		anything(aa, cc, xx); // aa = 10
		System.out.println(aa + ":" + cc + ":" + xx);

		int[] arr = { 1, 2 }; // 0x7ab
		System.out.println(arr[0]);
		function(arr); // 0x7ab
		System.out.println(arr[0]);
		int k = max(1, 2);
		double d = max(1.4, 1.5);
	}

	private static void printArr(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();

	}

	private static int[] merge(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];
		int ai = 0;
		int bi = 0;
		for (int k = 0; k < result.length; k++) {
			if (ai == a.length) {
				result[k] = b[bi];
				bi++;
				continue;
			} // else
			if (bi == b.length) {
				result[k] = a[ai];
				ai++;
				continue;
			} // else

			if (a[ai] < b[bi]) { // ArraysIndexOutOfBound
				result[k] = a[ai];
				ai++;
			} else {
				result[k] = b[bi];
				bi++;
			}

		}
		return result;
	}

	static void function(int[] s) { // 0x7ab
		s[0] = 14; // 0x7ab
	}

	static void anything(int a, char c, double x) { // a = 10
		a = a + 1000;
		c = 't';
		x = x * 2;
	}

	// Overload
	static int max(int a, int b) {
		System.out.println("Dang tim max int");
		if (a > b)
			return a;
		else
			return b;
	}

	static double max(double a, double b) {
		System.out.println("Dang tim max double");
		if (a > b)
			return a;
		else
			return b;
	}

}
