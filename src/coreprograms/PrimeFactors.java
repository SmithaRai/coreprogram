package coreprograms;
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
	      Scanner input = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      n = input.nextInt();
	     
	      for(int i = 2; i< n; i++) {
	         while(n%i == 0) {
	            System.out.println(i+" ");
	            n = n/i;
	         }
	      }
	      if(n >2) {
	         System.out.println(n);
	      }
	}

}
