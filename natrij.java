package Kattis;

import java.util.Scanner;

public class natrij {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] currenttime = new int[3];
		int[] blasttime = new int[3];
		int currentseconds;
		int blastseconds;
		
		while(sc.hasNextLine())
		{
			currenttime = StringToTime(sc.nextLine());
			blasttime = StringToTime(sc.nextLine());
			currentseconds = timeToSeconds(currenttime);
			blastseconds = timeToSeconds(blasttime);
			if(blastseconds <= currentseconds)
			{
				blastseconds += 86400;
			}
			System.out.println(timeToString(secondsToTime(blastseconds - currentseconds)));
		}
		System.exit(0);
	}
	public static int timeToSeconds(int[] time)
	{
		return time[0] * 3600 + time[1] * 60 + time[2];
	}
	public static int[] secondsToTime(int seconds)
	{
		return new int[] {seconds / 3600, 
				(seconds - seconds / 3600 * 3600) / 60,
				seconds - seconds / 60 * 60};
	}
	public static int[] StringToTime(String s)
	{
		int[] time = new int[3];
		time[0] = Integer.parseInt(s.substring(0, 2));
		time[1] = Integer.parseInt(s.substring(3, 5));
		time[2] = Integer.parseInt(s.substring(6, 8));
		return time;
	}
	public static String timeToString(int[] time)
	{
		return String.format("%02d", time[0]) + ":" + String.format("%02d", time[1]) + ":" + String.format("%02d", time[2]);
	}
}
