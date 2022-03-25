package leapyrspackage;

import java.util.Scanner;

public class LeapYear{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input= new Scanner(System.in);
System.out.println("enter a year:");
int y = input.nextInt();
byte c=0;
while(y!=0){
	y=(int) (y/10);
	++c;
}
if(c!=4) {
	System.out.println("invalid input");
         }

    if (y % 400 == 0) {
        System.out.println(" It's a leap year.");
                      } 
         else if (y % 100 == 0) {
                 System.out.println(" Not a leap year.");
                                }
         else if (y % 4 == 0) {
    System.out.println( " It's a leap year.");
                               }    
         else {
    System.out.println(" Not a leap year.");
              }
           
	      
                   

	}
	}                                        
