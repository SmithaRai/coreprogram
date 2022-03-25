package coreprograms;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
	static Random rand=new Random();
	static Scanner input=new Scanner(System.in);
	static float heads;
	static float tails;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of flips");
		int num = input.nextInt();
		
		for (int i = 0; i < num; i++) 
		{
            float flip = flip();
            System.out.println(flip);
            if (flip > 0.5) 
            {
                heads++;
            } else 
            	
            	if (flip < 0.5) 
            	{
                tails++;
            }
    
		
				}
		System.out.println(heads);
		System.out.println(tails);
		double percentHeads=(heads /(heads + tails))* 100;
	   double percentTails = 100 - percentHeads;	
	   
	   System.out.println("Heads:"+percentHeads);
	   System.out.println("Tails:"+percentTails);
	   
	   
	}
	static float flip()
	{
	
	return rand.nextFloat();

	}

}
