package tutorials.java.calendar;

import java.util.Scanner;

public class CalendarMain {
	
	public int parseDays(String weekdays) {
		if(weekdays.equals("SU")) return 0;
		else if (weekdays.equals("MO")) return 1; 
		else if (weekdays.equals("TU")) return 2; 
		else if (weekdays.equals("WE")) return 3; 
		else if (weekdays.equals("TH")) return 4; 
		else if (weekdays.equals("FR")) return 5; 
		else if (weekdays.equals("SA")) return 6;
		else return 0;
	}

	public void runCalendarMain() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		try {
			
			int year = 2020;
			int month = 0;
			int weekday = 0;
			while (month != -1) {
				System.out.println("년도를 입력하세요");
				System.out.print(">");
				year = scanner.nextInt();
				System.out.println("달을 입력하세요.");
				System.out.print(">");
				month = scanner.nextInt();
				System.out.println("첫째 날의 요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA)");
				System.out.print(">");
				String str_weekdays = scanner.next();
				weekday = parseDays(str_weekdays);
				System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(year, month));
				cal.printCalendar(year, month, weekday);
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("1~12의 값을 입력하세요.");
			System.out.println("프로그램을 종료합니다.");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		CalendarMain cm = new CalendarMain();
		cm.runCalendarMain();
		
	}
}
