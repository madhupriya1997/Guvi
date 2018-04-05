import java.util.*;
class Pn
{
	public static void main (String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>0)
		{
			System.out.println("Positive");
		}
		else
		{
			if(n==0)
			{
		              System.out.println("Zero");
			}
			else
			System.out.println("Negative");
		}
	}
}