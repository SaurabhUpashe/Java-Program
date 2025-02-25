import java.util.Scanner;
class Example 
{
	static private int x;
	static private double y;
	static private boolean z;
	static private int tot=0;
	static 
	{
		x=10;
		Scanner br = new Scanner(System.in);
		System.out.println("Enter the any fraction value for y: ");
		y=sc.nextDouble();
	}
	void getout()
	{
		System.out.println("X is: "+x);
		System.out.println("y is: "+y);
		System.out.println("boolean is: "+z);	
	}
}
class MainExample
{
	public static void main(String[] args) 
	{
		Example ob  = new Example();
	
		ob.getout();
		
	}
}
