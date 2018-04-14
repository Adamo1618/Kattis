package Kattis;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TetrationOld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat numberFormat = new DecimalFormat("0.000000");
		while (sc.hasNextDouble()) 
		{
			System.out.println(numberFormat.format(geta(sc.nextDouble())));
		}
	}
	public static double geta(double real)
	{

		double a = 1;
		double temp = 0;
		for(int i = 0; i < 30; i++)
		{
			temp = nextNewton(a, real);
			if(Math.abs(temp - a) < 0.000001 && Math.abs(temp - a) / temp < 0.000001)
			{
				return temp;
			}
			else
			{
				a = temp;
			}
		}
		return a;
	}
	public static double nextNewton(double current, double real)
	{
		// Implements Newton-Raphson for the function f(a) = a^N - N
		return current - (Math.pow(current, real) - real)/
				(Math.pow(current, real - 1) * real);
	}

}
