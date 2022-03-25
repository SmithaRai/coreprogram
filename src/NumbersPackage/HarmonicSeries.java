package NumbersPackage;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("enter nth value:");
float a,b=0;
byte i;

a=input.nextInt();

for (i=1;i<=a;i++) {
	b=b+(float)1/i;
}
	System.out.println(b);

	}	

}
