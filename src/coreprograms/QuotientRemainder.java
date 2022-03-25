package coreprograms;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 0,b=0;
		Scanner input = new Scanner(System.in);
		System.out.println("enter a and b:");
		a=input.nextByte();
		b=input.nextByte();
		System.out.println("quotient  value is:"+(a/b));
		System.out.println("remainder value is:"+(a%b));
	}

}
