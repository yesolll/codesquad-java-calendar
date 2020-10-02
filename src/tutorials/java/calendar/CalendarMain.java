package tutorials.java.calendar;

import java.util.ArrayList;
import java.util.Scanner;

public class CalendarMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		System.out.println("반복횟수를 입력하세요.");
		int re = scanner.nextInt();

		for (int i = 0; i < re; i++) {
			System.out.println("달을 입력하세요.");
			int month = scanner.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));

		}
		scanner.close();
	}

}
