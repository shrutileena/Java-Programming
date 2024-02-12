package com.example.exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			System.out.println("Start");
			int n1 = 10;
			int n2 = 1;
			int res = n1 / n2;
			System.out.println(res);
			
			if(n2 < 10) {
				throw new AgeInvalidException("My age is invalid");
			}
			
		} catch (AgeInvalidException e) {
			System.out.println(e.getMessage());
		} 
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		} finally {
			// always gets executed irrespective of whether expection is thrown or not
			System.out.println("End");
		}
	}

}
