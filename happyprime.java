package Kattis;

import java.util.Scanner;

public class happyprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] primelist = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		int number = 0;
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		for(int i = 0; i < testcases; i++)
		{
			System.out.print(sc.nextInt() + " ");
			number = sc.nextInt();
			System.out.println(number + " " + isHappyPrime(number, primelist));
		}
		
	}
	public static boolean isPrime(int number, int[] primelist)
	{
		if(number == 1)
		{
			return false;
		}
		for(int i = 0; i < primelist.length; i++)
		{
			if (number % primelist[i] == 0)
			{
				return false;
			}
			if(primelist[i] > (int)Math.sqrt(number))
			{
				return true;
			}
		}
		return true;
	}
	public static boolean isHappy(int number)
	{
		int sum = 0;
		while(number != 4)
		{
			while (number > 0) {
				sum += (number % 10) * (number % 10);
				number = number / 10;
			}
			number = sum;
			sum = 0;
			if(number == 1)
			{
				return true;
			}
		}
		return false;
	}
	public static String isHappyPrime(int number, int[] primelist)
	{
		if(isPrime(number, primelist))
		{
			if(isHappy(number))
			{
				return "YES";
			}
		}
		return "NO";
	}
}
