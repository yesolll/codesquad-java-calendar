package tutorials.java.calendar;

import java.util.Scanner;

public class Calendar {

	public final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		if (month == 1) {
			return 31;
		} else if (month == 2) {
			return 28;
		}// (...)
		return 31;

//		switch (month) {
//		case 2:
//			return 28;
//		case 4:
//			return 30;
//		// (...)
//		default:
//			return 1;
//		}
	}

	public void pirntSampleCalendar() {
		System.out.println(" 일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		int month = scanner.nextInt();

		System.out.printf("%d월은 %d일까지 있습니다.\n\n", month, cal.getMaxDaysOfMonth(month));
		cal.pirntSampleCalendar();
		scanner.close();

	}

}
