package Kattis;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class alldifferentdirections {

	public static void main(String[] args) {
		DecimalFormat numberFormat = new DecimalFormat("0.0000");
		Scanner outerscanner = new Scanner(System.in);
		int number = 0; //Number of sheeple
		String line = "";
		String currentString = "";
		double angle = 0.0;
		double distance = 0.0;
		int count = 0;
		double[] output = new double[3];
		
		while(outerscanner.hasNextInt())
		{
			number = outerscanner.nextInt();
			if(number == 0)
			{
				System.exit(0);
			}
			double[][] coordinates = new double[number][2]; // Array of x and y coordinates
			outerscanner.nextLine();
			while(outerscanner.hasNextLine() && count < number)
			{
				//Every iteration in this for loop reads an entire line of instructions
				
				line = outerscanner.nextLine();
				Scanner innerscanner = new Scanner(line);
				coordinates[count][0] = innerscanner.nextDouble();
				coordinates[count][1] = innerscanner.nextDouble();
				innerscanner.next(); // Discards "start"
				angle = innerscanner.nextDouble();
				
				
				while(innerscanner.hasNext()) // Reads all walk and turn instructions
				{
					currentString = innerscanner.next();
					if(currentString.equals("walk"))
					{
						distance = innerscanner.nextDouble();
						coordinates[count][0] = moveX(angle, distance, coordinates[count][0]);
						coordinates[count][1] = moveY(angle, distance, coordinates[count][1]);
					}
					if(currentString.equals("turn"))
					{
						angle += innerscanner.nextDouble();
					}
				}
				count++;
			}
			count = 0;
			output = avgAndMaxDist(coordinates, number);
			System.out.println(output[0] + " " + output[1] + " " + output[2]);
		}
	}
	public static double moveX(double angle, double distance, double x)
	{
		return x + Math.cos(angle * Math.PI / 180) * distance;
	}
	public static double moveY(double angle, double distance, double y)
	{
		return y + Math.sin(angle * Math.PI / 180) * distance;
	}
	public static double[] avgAndMaxDist(double[][] coordinates, int length)
	{
		double avgX = 0;
		double avgY = 0;
		double maxDist = 0;
		for (int i = 0; i < length; i++)
		{
			avgX += coordinates[i][0] / length;
			avgY += coordinates[i][1] / length;
			
		}
		for (int i = 0; i < length; i++)
		{
			maxDist = Math.max(maxDist, Math.sqrt((coordinates[i][0] - avgX) * (coordinates[i][0] - avgX) + 
					(coordinates[i][1] - avgY) * (coordinates[i][1] - avgY)));
		}
		return new double[] {avgX, avgY, maxDist};
	}

}
