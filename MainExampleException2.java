import java.io.InputStreamReader;
import java.io.BufferedReader;
class ExampleOfException1
{
	static private int x;
	static private double y;
	static private boolean z;
	static private int t;
	static private int tot=0;
	static
	{
		z=true;
		t=2;
	}
	static 
	{
		
		try
		{
			x=23/t;
		}
		catch (Exception e)
		{
			System.out.println("Exception is occures in static block: ");
		}
		
	}
	void getout()
	{
		System.out.println("X is: "+x);
		System.out.println("y is: "+y);
		System.out.println("boolean is: "+z);	
	}
}
class MainExampleException2
{
	public static void main(String[] args) 
	{
		Example ob  = new Example();
	
		ob.getout();
		
	}
}