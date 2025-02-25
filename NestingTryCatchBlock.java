class NestingTryCatchBlock 
{
	public static void main(String[] args) 
	{
		try
		{
			int []x = {10,20,30};
		    System.out.println("Outer try block start: ");
			try
			{
				int answer =10/0;//Exception is occur:ArithmaticException
				System.out.println("Answer "+answer);
			}
			catch (ArithmeticException e)
			{
				System.out.println("Inner catch Block: ArithmeticException Occure!!! ");
			}
			System.out.println("Accessing Array Elements: "+x[5]);//ArrayIndexOutOfBoundsException
		}
		catch (Exception e)
		{
			System.out.println("Outer Catch Block: ArrayIndexOutOfException Occures!!! ");
		}
		System.out.println("Program End!!!!!!!");
	}
}
