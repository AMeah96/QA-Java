package com.qa.PrintNumbers;

public class PrintNumbers {
	public static final String[] uniqueNums = { "", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };

	public static final String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

	public void toTen() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public void hundredToThousand() {
		for (int i = 100; i < 1000; i++) {
			System.out.println(i);
		}
	}

	public static String convert(int num) {
		if (num < 0) {
			return "minus " + convert(-num);
		}

		if (num < 20) {
			return uniqueNums[num];
		}

		if (num < 100) {
			return tens[num / 10] + ((num % 10 != 0) ? " " : "") + uniqueNums[num % 10];
		}

		if (num < 1000) {
			return uniqueNums[num / 100] + " hundred" + ((num % 100 != 0) ? " " : "") + convert(num % 100);
		}

		if (num < 1000000) {
			return convert(num / 1000) + " thousand" + ((num % 1000 != 0) ? " " : "") + convert(num % 1000);
		}

		if (num < 1000000000) {
			return convert(num / 1000000) + " million" + ((num % 1000000 != 0) ? " " : "") + convert(num % 1000000);
		}

		return convert(num / 1000000000) + " billion" + ((num % 1000000000 != 0) ? " " : "")
				+ convert(num % 1000000000);
	}

	public void toTenInWords() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(convert(i));
		}

	}

	public void toHundredWords() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(convert(i));
		}
	}

	public void toThousandWords() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println(convert(i));
		}
	}

	public void toBillion() {
		for (int i = 1; i <= 1000000000; i++) {
			System.out.println(convert(i));
		}
	}

	public void toMinusOneMillion() {
		for (int i = -1; i >= -10000000; i--) {
			System.out.println(convert(i));
		}
	}

}
