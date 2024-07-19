class CmdlmDifferentTypes
{
	public static void main(String[]args)
	{
		int x=0;
		float y=0.0f;
		double z=0.0;

		x=Integer.parseInt((args[0]));
		y=Float.parseFloat((args[1]));
		z=Double.parseDouble((args[2]));

		System.out.println("x="+x+"\t y="+y+"\t z="+z);
	}
}
