package tutorials.java.calendar;



public class Calendar {
	
	
	private final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		boolean leap;
		if ((year % 4 == 0 || year % 400 == 0 ) && year % 100 != 0) {
			leap = true;
		} else {
			leap = false;
		}
		return leap;
	}

	
	public int getMaxDaysOfMonth(int year, int month) {
		if(isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		}else {
			return MAX_DAYS[month - 1];
		}
	}

	
	public void printCalendar(int year, int month, int weekday) {
		CalendarMain cm = new CalendarMain();
		System.out.printf("    <<%4d년%3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		int maxDay = getMaxDaysOfMonth(year, month);

		for (int a = 0; a < weekday; a++) {
			System.out.print("   ");
		}
		
		int count = 0;
		if (weekday != 0) {
			count = 7 - weekday;
		}else {
			count = 0;
		}
		
		for(int j = 1; j <= count ; j++) {
			System.out.printf("%3d", j);
		}
		System.out.println();
		
		for (int i = count + 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == count) {
				System.out.println();
			}
//			System.out.println();
//			System.out.println(" 1  2  3  4  5  6  7");
//			System.out.println(" 8  9 10 11 12 13 14");
//			System.out.println("15 16 17 18 19 20 21");
//			System.out.println("22 23 24 25 26 27 28");
//			System.out.println("");
		}
	}

}
