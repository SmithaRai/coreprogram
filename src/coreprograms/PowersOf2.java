package coreprograms;

import java.util.Scanner;

public class PowersOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter Power value:");
		int n=input.nextInt();
		int l=2;
		      if(n<31) {
		          for(int i=1;i<=n;i++)
		               {
			            l=2*l;
			            System.out.println(l);
		               }
		                  }
	}

}
