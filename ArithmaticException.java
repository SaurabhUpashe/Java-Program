import java.util.Scanner;
class ArithmaticException 
{
	public static void main(String[] args) 
	{
		double x=0,y=0;
		double ans=0.0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the X and Y Value");
		try
		{
			x=sc.nextInt();
			y=sc.nextInt();
			ans=x/y;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception e: "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(" "+e);
		}
		System.out.println("Answer: "+ans);
	}
}
