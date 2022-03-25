package coreprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int year;
	      System.out.println("Enter an year :");
	      Scanner input = new Scanner(System.in);
	      year=input.nextInt();

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("It's a leap year");
	      else
	         System.out.println("Not a leap year");
	}

}
