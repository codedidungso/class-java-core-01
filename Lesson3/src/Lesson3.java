import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {

	public static void main(String[] args) {
		// int char float ...
		String str1 = "Myoccho"; // int[] char[]
		String str2 = "Myoccho";
		char[] cs = new char[10];
		cs = "Linh".toCharArray(); // "Linh" => ['L','i','n','h']
		
		System.out.println("Do dai cua cs:" + cs.length);
		System.out.println("Do dai cua str1: " + str1.length());
		
		if (str1.compareTo(str2)==0) { // -1 0 1
			
			System.out.println(str1.compareTo(str2)+"TRUE");
		} else {
			System.out.println(str1.compareTo(str2)+"FALSE");
		};
		for (int i = 0; i < cs.length; i++) {
			System.out.println("cs[]: Ky tu thu " + i + " la: " + cs[i]);
		}
		for (int i = 0; i < str1.length(); i++) {
			System.out.println("String str1: Ky tu thu " + i + " la: " + str1.charAt(i));
		}
		
		// so sanh, sap xep, tim kiem 
		Scanner sc = new Scanner(System.in);
		str1 = sc.next();
		System.out.println("Ban vua nhap vao: " + str1);
		
		// Nhap so luong phan tu cua mang 
		System.out.print("Nhap vao so luong phan tu: ");
		int soluong = sc.nextInt();
		
		String[] strArray = new String[soluong];  
		System.out.println("Nhap vao tun phan tu cua mang: ");
		for (int i = 0; i < strArray.length; i++) {
			//Nhap vao tung phan tu.
			strArray[i] = sc.nextLine();
		}
		
		//sap xep mang string su dung compareTo()
//		for (int i = 0; i < strArray.length-1; i++) {		//strArray.length
//			for (int j = i; j < strArray.length-1; j++) {	//
//				if(strArray[j].compareTo(strArray[j+1])>0) { // strArray[i].compareTo(strArray[j] 	
//					String temp = strArray[j];	
//					strArray[j] = strArray[j+1];	
//					strArray[j+1] = temp;
//					
//				}
//			}
//		}
		Arrays.sort(strArray);
		
		System.out.println("Mang sau khi duoc sap xep: ");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		String key = "cantim";
		boolean flag = false;
		
		for (int i = 0; i < strArray.length; i++) {
			if(strArray[i].equals(key)) {
				System.out.println("Tim thay tai vi tri: " + i);
				flag = true;
			}
		}
		if(flag) {
			System.out.println("Tim thay!");
		}
		else {
			System.out.println("Khong tim thay!");
		}
		
	}

}
