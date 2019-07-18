import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		// Easy session
		System.out.println("===Bai 1, 2===");
		System.out.print("Nhap vao N: ");
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		int[] array = new int[N];
		int sum7 = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print("Nhap vao phan tu thu " + i + ": ");
			array[i] = sc.nextInt();
		}
		System.out.print("Cac so o vi tri chan la: ");
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0)
				System.out.print(array[i] + ", ");
			if (array[i] % 7 == 0)
				sum7 += array[i];
		}
		System.out.println("\nTong cac so chia het cho 7 la: " + sum7);

		// Hard session
		System.out.println("===Bai 3===");
		System.out.print("Nhap vao N: ");
		N = sc.nextInt();
		int[][] matrix = new int[N][N];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("Nhap vao A[" + (i + 1) + "][" + (j + 1) + "]: ");
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Chuyen vi cua A: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[j][i] + " ");
			}
			System.out.println();
		}
		int D = 0;
		if (N == 1) {
			D = matrix[0][0];
		} else if (N == 2) {
			D = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
		} else {
			
			D = 0;
			for (int i = 0; i < matrix.length; i++) {
				int temp = 1;
				for (int j = 0; j < matrix.length; j++) {
					temp = temp * matrix[(i + j) % N][j];
				}
				D += temp;
				temp = 1;
				for (int j = 0; j < matrix.length; j++) {
					temp = temp * matrix[(i - j + N) % N][j];
				}
				D -= temp;
			}
		}
		System.out.println("\nDinh thuc: " + D);
		
		//Bai 4
		System.out.println("== Bai 4 ===");
		System.out.print("Nhap vao N: ");
		N = sc.nextInt();
		String[] arrayString = new String[N];
		for (int i = 0; i < arrayString.length; i++) {
			System.out.println("Nhap vao chuoi thu " + i + ": ");
			arrayString[i] = sc.next();
		}
		int[] flag = new int[N];
		for (int i = 0; i < arrayString.length; i++) {
			if (flag[i] == -1)
				continue;
			for (int j = i; j < arrayString.length; j++) {
				if (i == j)
					continue;
				if (arrayString[i].equals(arrayString[j])) {
					flag[i] = -1;
					flag[j] = -1;
				}
			}
			if (flag[i] == -1)
				System.out.println("Dumplicated: " + arrayString[i]);
		}

	}
}
