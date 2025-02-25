class DemoProgSIException
{
	public static void main(String []args)
	{
		int p=0 ,n=0;
		double r=0.0,si=0.0;
		
		try
		{
			p=Integer.parseInt(args[0]);
			n=Integer.parseInt(args[1]);
			r=Double.parseDouble(args[2]);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handling is occurs please pass the argument");
		}
		si=(p*r*n)/100;
		
		System.out.println("Simple Intrest is:"+si);
	}
}