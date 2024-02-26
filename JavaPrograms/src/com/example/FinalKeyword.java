package com.example;

final class Calc {

	public void show() {
		System.out.println("inside show method of Calc class");
	}

	// final method
	// to stop method overriding we can make method final
	// sub class will not be able to override this method
	public final void add(int a, int b) {
		System.out.println(a + b);
	}
}

// below class gives error as Calc is final
// we cannot extend final class

//class AdvCalc extends Calc {
//
//}

public class FinalKeyword {

	public static void main(String[] args) {

		final int num = 8; // final variables cannot be changed they are constant
		System.out.println(num);

//		num =10; // The final local variable num cannot be assigned. It must be blank and not using a compound assignment

		Calc calc = new Calc();
		calc.show();
		calc.add(2, 3);
	}

}
