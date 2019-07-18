import java.util.Arrays;

// 1. In ra tat ca cac so nguyen to dau tien < 1000. 
// 2. Nhap vao 2 so a,b. Kiem tra xem a,b co phai la 2 so nguyen to cung nhau.
// trong ham main, truoc dau ; la dau ) 
// 3. Merge Sort / Quick Sort
// 4. In ra tat ca cac so nguyen to dau tien < 100000.
public class Lesson4 {
	static int k = 9;

	public static void main(String[] args) {
//		System.out.println(k);
		int a = 10;
		int b = 15;
		int c;
		// c = max of (a,b)
		// cach 1
		c = a > b ? a : b;
		// cach 2
		if (a > b) {
			c = a;
		} else {
			c = b;
		}
		// cach 3
		c = maxOf(100, 99);
		inra(c);
		inra(maxOf(98, 101));
		System.out.println();
		// input: [1,5,2,4,5,1]
		//
		int[] mangint = { 1, 4, 2, 5, 6, 8, 5, 3, 9, 10, 15, 13, 18, 15, 13, 14 };
		mangint = hamSapXep(mangint); // f(3) = 9
		for (int i = 0; i < mangint.length; i++) {
			inra(mangint[i]);
		}

		// recursive
		// hienthi(0);
		System.out.println("\nFibonanci 7: " + Fibo(7));
		int key = 16;
		int position = binarySearch(mangint, 0, mangint.length, key);
		System.out.println("Vi tri tim thay: " + position);
	}

	//Arrays.binarySort(mang[], key) 
	private static int binarySearch(int[] mangint, int start, int end, int key) {
		System.out.println("====");
		for (int i = start; i < end; i++) {
			System.out.print(mangint[i]+", ");
		}
		System.out.println();
		if (start == end)
			return -1;
		int i = (start + end) / 2;
		int mid = mangint[i];
		if (mid == key) {
			return i;
		} else {
			if (mid > key)
				return binarySearch(mangint, start, i, key);
			else
				return binarySearch(mangint, i + 1, end, key);
		}

	}

	public static void hienthi(int k) {
		System.out.println("Print" + k);
		if (k == 20)
			return;
		else
			hienthi(k + 1);
	}

	// fibonanci
	static int Fibo(int k) {
		// F(n) = F(n-1) + F(n-2)
		// F(1) = F(2) = 1
		if (k < 3)
			return 1;
		else {
			return Fibo(k - 1) + Fibo(k - 2); // 1 1 2 3 5 8 13 21 ....
		}
	} // *xep 8 quan hau

	static int[] hamSapXep(int[] input) { // y = f(x) = x^2
		// sap xep input
		Arrays.sort(input);// int[] String[] char[] byte[] long[]

		return input;
	}

	static void inra(int c) { // y = f(x,z)
		System.out.print(c + ",");
		return;
	}

	static int maxOf(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

}
