package Kattis;

public class Doorman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static int getNumberOfPeople(int maxdiff, String queue)
	{
		int netwomen = 0;
		int length = queue.length();
		int[] values = new int[length];
		int count = 0;
		
		for(int i = 0; i < length; i++)
		{
			if (queue.charAt(i) == 'W')
			{
				values[i] = 1;
			}
			else
			{
				values[i] = -1;
			}
		}
		for (int i = 0; i < length; i++)
		{
			if(Math.abs(netwomen + values[i]) < maxdiff)
			{
				netwomen += values[i];
				count++;
			}
			else
			{
				
				if(Math.abs(netwomen + values[i + 1]) < maxdiff)
				{
					
				}
			}
		}
		return count;
	}
}
