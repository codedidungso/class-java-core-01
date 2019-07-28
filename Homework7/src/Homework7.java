import java.util.Scanner;

public class Homework7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 5;

		String hoten[] = new String[num];
		float[] Toan = new float[num];
		float[] Van = new float[num];
		float[] Anh = new float[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Nhap vao nguoi thu " + i);
			System.out.print("Ho ten: ");
			hoten[i] = sc.nextLine();
			System.out.print("Diem toan: ");
			Toan[i] = sc.nextFloat();
			System.out.print("Diem van: ");
			Van[i] = sc.nextFloat();
			System.out.print("Diem anh: ");
			Anh[i] = sc.nextFloat();
			sc.nextLine();
		}
		// print formatted info
		for (int i = 0; i < num; i++) {
			System.out.printf("%-30s\t- Toan %2.2f - Van %2.2f - Anh %2.2f\n", hoten[i], Toan[i], Van[i], Anh[i]);
		}

		// create index
		int tIndex[] = new int[num];
		int vIndex[] = new int[num];
		int aIndex[] = new int[num];
		for (int i = 0; i < num; i++) {
			tIndex[i] = i;
			vIndex[i] = i;
			aIndex[i] = i;
		}
		// index Toan
		for (int i = 0; i < num; i++)
			for (int j = i; j < num; j++)
				if (Toan[tIndex[i]] < Toan[tIndex[j]]) {
					int temp = tIndex[i];
					tIndex[i] = tIndex[j];
					tIndex[j] = temp;
				}

		// index Van
		for (int i = 0; i < num; i++)
			for (int j = i; j < num; j++)
				if (Van[vIndex[i]] > Van[vIndex[j]]) {
					int temp = vIndex[i];
					vIndex[i] = vIndex[j];
					vIndex[j] = temp;
				}

		System.out.println("Diem tieng anh == 8: ");
		for (int i = 0; i < num; i++) {
			if (Anh[i] == 8)
				System.out.printf("%-30s\t- Toan %2.2f - Van %2.2f - Anh %2.2f\n", hoten[i], Toan[i], Van[i], Anh[i]);
		}
		System.out.println("Diem Toan top 3:");
		for (int i = 0; i < 3; i++) {
			System.out.printf("%-30s\t- Toan %2.2f - Van %2.2f - Anh %2.2f\n", hoten[tIndex[i]], Toan[tIndex[i]],
					Van[tIndex[i]], Anh[tIndex[i]]);
		}
		System.out.println("Diem Van top -3:");
		for (int i = 0; i < 3; i++) {
			System.out.printf("%-30s\t- Toan %2.2f - Van %2.2f - Anh %2.2f\n", hoten[vIndex[i]], Toan[vIndex[i]],
					Van[vIndex[i]], Anh[vIndex[i]]);
		}
		System.out.print("Nhap ten nguoi tim kiem:");
		String key = sc.nextLine();
		
		for (int i = 0; i < num; i++) {
			if(hoten[i].toLowerCase().contains(key.toLowerCase())) {
				System.out.printf("%-30s\t- Toan %2.2f - Van %2.2f - Anh %2.2f\n", hoten[i], Toan[i], Van[i], Anh[i]);
			}
		}
	}
}
