package coreprograms;
import java.util.Scanner;
public class Check_Even_Or_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("enter a number:");
		int a=input.nextInt();
		if(a%2==0)
		{
			System.out.println(+a+" is even number");
		}
		else
		{
			System.out.println(+a+" is odd number ");
		}
	}

}
