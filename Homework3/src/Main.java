import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("===BAI 1===");
		System.out.print("Nhap vao so luong nguoi: ");
		int n;
		Scanner sc = new Scanner(System.in);
		n = Integer.valueOf(sc.nextLine()); // parseInt
		String[] stringArray = new String[n];
//		sc.nextLine();

		for (int i = 0; i < n; i++) {
			stringArray[i] = sc.nextLine().trim();
		}
		// 3\n
		// THIEN\n
		// DUY\n

		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(i + ":" + stringArray[i]);
		}
		System.out.println("Nhap vao ten nguoi can tim kiem: ");
		String key = sc.nextLine();
		for (int i = 0; i < stringArray.length; i++) {
			String current = stringArray[i];
			current = current.toLowerCase(); // THIEnn.toLowerCase()
			key = key.toLowerCase();
			if (current.contains(key)) {
				System.out.println(stringArray[i]);
			}
//			if (stringArray[i].toLowerCase().contains(key.toLowerCase())) {
//				System.out.println("Tim thay: " + stringArray[i]);
//			}
		}

		int count = 0;

		for (int i = 0; i < stringArray.length; i++) {
			stringArray[i] = stringArray[i];
			for (int j = 0; j < stringArray[i].length(); j++) {
				if (stringArray[i].charAt(j) == 'a') {//
					count++;
				}
			}
		}
		System.out.println("So luong chu a: " + count);

		System.out.println("===Bai 2===");
		System.out.println("Nhap vaop chuoi: ");
		String s;
		s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s);
		System.out.print(s);
		if (sb.reverse().toString().equals(s)) {
			System.out.println(" co tinh dao nguoc, ");
		} else {
			System.out.println(" khong co tinh dao nguoc ");
		}
		int i = 0;
		for (; i < s.length(); i++) {
			if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				System.out.println("FIRST NOT DUMPLICATE: " + s.charAt(i));
				break;
			}
		}
		if (i == s.length())
			System.out.println("DOESNT EXIST");

		System.out.println("===Bai 3===");
		for (int j = 0; j < stringArray.length; j++) {
			// Nguyen Duc Thien;
			// Nguyen Van Thien
			// Nguyen;
			// Nguyen Thien;
			// ten - ho - ten dem
			// ThienNguyenDuc
			// ThienNguyenVan
			// Nguyen
			// ThienNguyen
			String ten, tendem, ho;
			stringArray[j] = stringArray[j].trim();
			
			if (stringArray[j].indexOf(' ') >= 0) {
				ten = stringArray[j].substring(stringArray[j].lastIndexOf(' ') + 1);
				ho = stringArray[j].substring(0, stringArray[j].indexOf(' '));
			} else {
				ten = stringArray[j];
				ho = "";
			}
			if (stringArray[j].lastIndexOf(' ') != stringArray[j].indexOf(' ')) {
				tendem = stringArray[j].substring(stringArray[j].indexOf(' ') + 1, stringArray[j].lastIndexOf(' '));
			} else {
				tendem = "";
			}

			System.out.println(ho + ":" + tendem + ":" + ten);
			stringArray[j] = ten + " " + tendem + " " + ho;
		}
		for (int j = 0; j < stringArray.length - 1; j++) {
			for (int k = j + 1; k < stringArray.length; k++) {
				if (stringArray[j].toLowerCase().compareTo(stringArray[k].toLowerCase()) > 0) {
					String temp = stringArray[j];
					stringArray[j] = stringArray[k];
					stringArray[k] = temp;
				}
			}
		}
		for (int j = 0; j < stringArray.length; j++) {
			String ten, tendem, ho;
			stringArray[j] = stringArray[j].trim();
			if (stringArray[i].indexOf(' ') != -1) {
				ten = stringArray[j].substring(stringArray[j].lastIndexOf(' ') + 1);
				ho = stringArray[j].substring(0, stringArray[j].indexOf(' '));
			} else {
				ten = stringArray[j];
				ho = "";
			}
			if (stringArray[j].lastIndexOf(' ') != stringArray[j].indexOf(' ')) {
				tendem = stringArray[j].substring(stringArray[j].indexOf(' ') + 1, stringArray[j].lastIndexOf(' '));
			} else {
				tendem = "";
			}

//			System.out.println(ho + ":" + tendem + ":" + ten);
			stringArray[j] = ten + " " + tendem + " " + ho;
		}
		System.out.println("Danh sach da duoc sap xep la ");
		for (int j = 0; j < stringArray.length; j++) {
			System.out.println(stringArray[j]);
		}

		System.out.println("===Bai 4===");
		System.out.print("Nhap vao A:");
		String A = sc.nextLine();
		System.out.print("Nhap vao B:");
		String B = sc.nextLine();

		if (A.length() > B.length()) {
			String t = A;
			A = B;
			B = t;
		}
		String str = "";

		int n1 = A.length(), n2 = B.length();

		A = new StringBuilder(A).reverse().toString();
		A = new StringBuilder(A).reverse().toString();

		int carry = 0;
		for (i = 0; i < n1; i++) {
			int sum = ((int) (A.charAt(i) - '0') + (int) (B.charAt(i) - '0') + carry);
			str += (char) (sum % 10 + '0');
			carry = sum / 10;
		}

		for (i = n1; i < n2; i++) {
			int sum = ((int) (B.charAt(i) - '0') + carry);
			str += (char) (sum % 10 + '0');
			carry = sum / 10;
		}

		if (carry > 0)
			str += (char) (carry + '0');

		//str = new StringBuilder(str).reverse().toString();
		System.out.println(str);
		
	}
	
	

}

