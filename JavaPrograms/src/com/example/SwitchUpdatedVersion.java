package com.example;

public class SwitchUpdatedVersion {

	public static void main(String[] args) {
		String day = "Sunday";

		// old way of doing switch
		// String can be used in case
		switch (day) {
		case "Saturday", "Sunday":
			System.out.println("Wake up at 8 AM");
			break;
		case "Monday":
			System.out.println("Wake up at 7 AM");
			break;
		default:
			System.out.println("Wake up at 10 AM");
			break;
		}

		// new way
		// ->
		// not need of break statement
		switch (day) {
		case "Saturday", "Sunday" -> System.out.println("Wake up at 8 AM");
		case "Monday" -> System.out.println("Wake up at 7 AM");
		default -> System.out.println("Wake up at 10 AM");
		}

		// new way
		// switch as an expression
		String result = null;
		switch (day) {
		case "Saturday", "Sunday" -> result = "6 AM";
		case "Monday" -> result = "7 AM";
		default -> result = "10 AM";
		}
		System.out.println(result);

		// new way
		// switch as an expression
		result = switch (day) {
		case "Saturday", "Sunday" -> "6 AM";
		case "Monday" -> "7 AM";
		default -> "10 AM";
		};
		System.out.println(result);

		// new way
		// switch as an expression
		result = switch (day) {
		case "Saturday", "Sunday" : yield "6 AM";
		case "Monday" : yield "7 AM";
		default : yield "10 AM";
		};
		System.out.println(result);
	}

}
