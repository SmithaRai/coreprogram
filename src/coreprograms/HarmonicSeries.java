package coreprograms;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("Enter a number:");
Scanner input = new Scanner(System.in);
int n = input.nextInt();

int i;
System.out.print("The Harmonic Series is : ");
for(i=1;i<=n;i++)
  {
  //System.out.print("The Harmonic Series is : ");
        System.out.print(" 1/"+i);
       if(i!=n) {
    	   System.out.print(" +");}
         
  }
double s=0.0;
 while(n>0) {
	 s=s+(double)(1/n);
     n--;
 }
System.out.println("harmonic series value is: "+s);

}}
