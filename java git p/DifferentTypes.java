class DifferentTypes
{
	public static void main(String []args)
	{
		int x=0;
		float y=0.0f;
		double z=0.0;

		try
		{
			x=Integer.parseInt(args[0]);
			y=Float.parseFloat(args[1]);
			z=Double.parseDouble(args[2]);
		}
		catch(Exception e)
		{	
			System.out.println("Please Enter the commandline arguments while executing..!!");
		}
		
		System.out.println("x="+x+"\t y="+y+"\t z="+z);
	}
}
