class CmdlnDifferentTypes
{
	public static void main(String[]args)
	{
		int x=0;
		float ft=0.0F;
		double db=0.0;

		try
		{
			x=(args[0]);
			ft=(args[1]);
			db=(args[2]);
		}
		catch(Exception e)
		{
			System.out.println("Please Enter the commandline arguments while executing..!!");
		}
		System.out.println("x="+x+"\t y="+ft+"\t z="+db);
	}
}