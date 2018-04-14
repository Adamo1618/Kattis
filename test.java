package Kattis;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		System.out.println(geta( 2.000000));
	}
	public static double geta(double real)
	{
		return Math.pow(real, 1/real);
	}
	public static double nextNewton(double current, double real)
	{
		// Implements Newton-Raphson for the function f(a) = a^N - N
		return current - (Math.pow(current, real) - real)/
				(Math.pow(current, real - 1) * real);
	}

}
