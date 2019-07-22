import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Homework5 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Input day: ");
		int day = sc.nextInt();
		System.out.print("Input month: ");
		int month = sc.nextInt();
		System.out.print("Input year: ");
		int year = sc.nextInt();
		System.out.println("checkValidDay: " + checkValidDay(day, month, year));
		sc.nextLine();
		System.out.print("input time: ");
		String time = sc.nextLine();
		System.out.print("input second: ");
		int second = sc.nextInt();
		System.out.println("after " + second + "s: " + nextTime(time, second));
		sc.nextLine();
		System.out.print("Input day1: ");
		String day1 = sc.nextLine();
		System.out.print("Input day2: ");
		String day2 = sc.nextLine();
		System.out.println("day1 sub day2: " + subDay(day1, day2));
	}

	private static int subDay(String day1, String day2) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.set(Integer.parseInt(day1.substring(0, day1.indexOf('-'))),
				Integer.parseInt(day1.substring(day1.indexOf('-') + 1, day1.lastIndexOf('-'))) - 1,
				Integer.parseInt(day1.substring(day1.lastIndexOf('-') + 1)) - 1);
		cal2.set(Integer.parseInt(day2.substring(0, day1.indexOf('-'))),
				Integer.parseInt(day2.substring(day1.indexOf('-') + 1, day1.lastIndexOf('-'))) - 1,
				Integer.parseInt(day2.substring(day1.lastIndexOf('-') + 1)) - 1);
		Date d = new Date(32,32,32);
		System.out.println(d.toString());
		return (int) (cal1.getTimeInMillis() - cal2.getTimeInMillis()) / 86400000;

	}

	private static boolean checkValidDay(int day, int month, int year) {
		if (month > 12 || month < 1)
			return false;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			if (month == 2 && (day < 1 || day > 29))
				return false;
		} else {
			if (month == 2 && (day < 1 || day > 28))
				return false;
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day < 1 || day > 31)
				return false;v
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day < 1 || day > 30)
				return false;
		}

		return true;
	}

	private static String nextTime(String time, int second) {
		int hour = Integer.parseInt(time.substring(0, 2));
		int min = Integer.parseInt(time.substring(2, 4));
		int sec = Integer.parseInt(time.substring(4));
		if (min > 59 || sec > 59)
			return "Wrong input";
		sec += second;
		min += sec / 60;
		hour += min / 60;
		sec %= 60;
		min %= 60;
		hour %= 60;
		return String.format("%02d%02d%02d", hour, min, sec);

	}

}