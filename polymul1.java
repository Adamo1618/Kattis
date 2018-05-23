package Kattis;

import java.util.Scanner;

//Source: https://open.kattis.com/problems/polymul1

public class polymul1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		for(int i = 0; i < testcases; i++)
		{
			int degree1 = sc.nextInt();
			int[] polynomial1 = new int[degree1 + 1];
			for(int j = 0; j <= degree1; j++)
			{
				polynomial1[j] = sc.nextInt();
			}

			int degree2 = sc.nextInt();
			int[] polynomial2 = new int[degree2 + 1];
			for(int j = 0; j <= degree2; j++)
			{
				polynomial2[j] = sc.nextInt();
			}

			int[] output = convolve(polynomial1, polynomial2);
			System.out.println(output.length - 1);
			for(int j = 0; j < output.length; j++)
			{
				System.out.print(output[j] + " ");
			}

		}
		System.exit(0);
	}
	public static int[] convolve(int[] polynomial1, int[] polynomial2)
	{
		int length = polynomial1.length + polynomial2.length - 1;
		int[] output = new int[length];

		for(int index = 0; index < length; index++)
		{
			for(int i = 0; i <= index; i++)
			{
				try
				{
					output[index] += polynomial1[index - i] * polynomial2[i];
				}
				catch(ArrayIndexOutOfBoundsException yolo)
				{

				}
			}
		}
		return output;
	}
}
