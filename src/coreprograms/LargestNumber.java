package coreprograms;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a,b,c;
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();

		    if(a>b&&a>c)
		    {
		       System.out.println(+a+" is largest number");
		    }
			if(b>a&&b>c)
			{
				System.out.println(+b+" is largest number");
		     }
		    if(c>a&&c>b)
		    {
		    	System.out.println(+c+" is largest number");
		    }
	}

}
