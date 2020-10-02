package tutorials.java.calendar;

import java.util.Scanner;

public class CalendarMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		try {
			
		int month = 1;
		while (month != -1) {
			System.out.println("달을 입력하세요.");
			System.out.print(">");
			month = scanner.nextInt();
			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
		}
		}catch (Exception e){
			System.out.println("1~12의 값을 입력하세요.");
			System.out.println("프로그램을 종료합니다.");
		}
		scanner.close();
	}

}
