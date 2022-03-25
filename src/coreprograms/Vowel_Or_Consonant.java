package coreprograms;

import java.util.Scanner;

public class Vowel_Or_Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter an alphabet:");
		char ch = input.next().charAt(0); 

		if ((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
		   {
			System.out.println( " It is a vowel");
		   }
		else 
		    {
			System.out.println( "It is a consonant");
		    }
	}

}
