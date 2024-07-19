class IfElseNesting
{
	public static void main(String[]args)
	{
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int z=Integer.parseInt(args[2]);

		if(x>y)
		{
			if(x>z)
			{
				System.out.println("max no is:  "+x);
			}
			else
			{
				System.out.println("max no is:  "+z);
			}
		}
		else
		{
			if(y>z)
			{
				System.out.println("max no is:  "+y);
			}
			else
			{
				System.out.println("max no is:  "+z);
			}
		}
	}
}