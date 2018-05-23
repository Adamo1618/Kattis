package Kattis;

import java.util.Scanner;

//Source: https://open.kattis.com/problems/guess

public class guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int min = 1, max = 1001, mid = 501;
		System.out.println(mid);

		for(int i = 0; i < 10; i++)
		{
			String input = sc.nextLine();
			if(input.equals("higher"))
			{
				min = mid;
			}
			else
			{
				if(input.equals("lower"))
				{
					max = mid;
				}
				else
				{
					break;
				}
			}
			mid = (min + max) / 2;
			System.out.println(mid);
		}
		System.exit(0);
	}
}
