package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) { Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("What is your start amount?");
		double startAmount = in.nextDouble();
		
		System.out.println("What is your win chance?");
		double winChance = in.nextDouble();
		
		System.out.println("What is the win limit you would like to set?");
		double winLimit = in.nextDouble();
		
		System.out.println("How many days will you be playing for?");
		int totalDays = in.nextInt();
		int dayCount = 0;
		int success = 0;
		int ruin = 0;
		double expectedRuin = 0.0;
		
		while (dayCount < totalDays && startAmount > 0)
		{
		while (startAmount < winLimit && startAmount > 0)
		{
			if (winChance > Math.random())
		{
			System.out.println("success");
			startAmount ++;
		
		}
		else
		{
			System.out.println("loose");
			startAmount --;
		}	
		}
		dayCount++;
		if (startAmount == winLimit)
		{
			success = success +1;
		}
		else
		{ruin = ruin + 1;}
	}
		System.out.println("success rate =" + (success / totalDays));
		double a = (1 - winChance)/winChance;
		if (winChance == 0.5)
		{expectedRuin = 1 - (startAmount)/winLimit;}
		else
		{expectedRuin=(Math.pow(a,startAmount)-Math.pow(a,winLimit))/(1-Math.pow(a,winLimit));}
		System.out.println(expectedRuin);  
	}

}

