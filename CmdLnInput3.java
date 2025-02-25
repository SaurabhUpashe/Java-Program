class CmdLnInput3
{
	public static void main(String []args)
	{
		int x=0,y=0;

		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);

		System.out.println("X="+x+"\t Y="+y);
		System.out.println("Addition is: "+(x+y));
	}
}
