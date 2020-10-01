package tutorials.java.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요. (입력 예 : 5 10)");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] splitedInput = input.split(" ");
		int first = Integer.parseInt(splitedInput[0]);
		int second = Integer.parseInt(splitedInput[1]);

		int result = first + second;
		System.out.println("두 수의 합은 " + result + "입니다.");
	}

}
