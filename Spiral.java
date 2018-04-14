package Kattis;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(value(-3, -1));
	}
	public static int layer(int number)
	{
		int layer = 0;
		while(number > (2 * layer + 1) * (2 * layer + 1))
		{
			layer++;
		}
		return layer;
	}
	public static int value(int x, int y)
	{
		int l = Math.max(Math.abs(x), Math.abs(y));		
		if(l > Math.abs(y))
		{
			// Right edge
			if(x < 0)
				return (2*l+1)*(2*l+1)-3*l+y;
			// Left edge
			else
				return (2*l+1)*(2*l+1)-7*l+y;
		}
		else
		{
			// Lower edge
			if(y < 0)
				return (2*l+1)*(2*l+1)-5*l+x;
			// Upper edge
			else
				return (2*l+1)*(2*l+1)-l+x;
		}
	}
}
