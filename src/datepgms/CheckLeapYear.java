package datepgms;

import java.time.LocalDate;

public class CheckLeapYear {

	public static void main(String[] args) {
		LocalDate date=LocalDate.of(2018, 10, 23);
		System.out.println(date.isLeapYear());
	}
}
