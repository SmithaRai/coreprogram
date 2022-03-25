package coreprograms;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		byte a=0,b=0,c=0;
		System.out.println("enter a and b:");
		a=input.nextByte();
		b=input.nextByte();
		
		System.out.println("a value before swapping is:"+a);
		System.out.println("b value before swapping is:"+b);
		
		c=a;
		a=b;
		b=c;
		System.out.println(" ");
		System.out.println("a valueafter swapping is:"+a);
		System.out.println("b valueafter swapping is:"+b);
	}

}
