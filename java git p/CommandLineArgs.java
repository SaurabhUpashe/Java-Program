class CommandLineArgs
{
	public static void main(String[]args)
	{
		int x=0,y=0;
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);

  		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("y="+(x+y));
	}
}