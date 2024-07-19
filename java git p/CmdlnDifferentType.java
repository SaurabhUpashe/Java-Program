class CmdlnDifferentType
{
	public static void main(String[]args)
	{
		int x=0;
		float ft=0.0F;
		double db=0.0;

		try
		{
			x=Interger.parseInt((args[0]));
			ft=Float.parseFloat((args[1]));
			db=Double.parseDouble((args[2]));
		}
		catch(Exception e)
		{
			System.out.print("Please Enter the commandline arguments while executing..!!");
		}
		System.out.println("x="+x+"\t y="+ft+"\t z="+db);
	}
}