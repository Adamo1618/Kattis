package Kattis;
import java.util.Scanner;

public class almostperfect
{
	public static void main(String[] args)
	{
		int sum = 0;
		int number = 0;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) 
		{
			number = sc.nextInt();
			sum = getProperDivisorSum(number);
			if(number == sum)
			{
				System.out.println(number + " perfect");
			}
			else
			{
				if(Math.abs(number - sum) <= 2)
				{
					System.out.println(number + " almost perfect");
				}
				else
				{
					System.out.println(number + " not perfect");
				}
			}
		}
	}
	public static int getProperDivisorSum(int number)
	{
		int sum = 1;
		int root = (int) Math.sqrt(number);
		for (int i = 2; i <= root; i++)
		{
			if(number % i == 0)
			{
				sum += i;
				if(i != number / i)
				{
					sum += number / i;
				}
			}
		}
		return sum;
	}
}