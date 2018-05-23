package Kattis;

import java.text.DecimalFormat;
import java.util.Scanner;

public class aboveaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat numberFormat = new DecimalFormat("0.000");
		int testcases = sc.nextInt();
		int classmembers = 0;
		double average = 0;
		double output = 0;
		for(int i = 0; i < testcases; i++)
		{
			classmembers = sc.nextInt();
			int[] values = new int[classmembers];
			for(int j = 0; j < classmembers; j++)
			{
				average += values[j] = sc.nextInt();
			}
			average /= classmembers;
			
			for(int j = 0; j < classmembers; j++)
			{
				if(average < values[j])
				{
					output += 100.0 / classmembers;
				}
			}
			System.out.println(numberFormat.format(output) + "%");
			output = 0;
			average = 0;
		}
	}
}
