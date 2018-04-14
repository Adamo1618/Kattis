package Kattis;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tetration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat numberFormat = new DecimalFormat("0.000000");
		while (sc.hasNextDouble()) 
		{
			System.out.println(numberFormat.format(getA(sc.nextDouble())));
		}
	}
	public static double getA(double real)
	{
		return Math.pow(real, 1/real);
	}
}
