class CommandLineDemo 
{
	public static void main(String[] args) 
	{
		int x=0;
		float y=0.0f;
		x=Integer.parseInt(args[0]);
		y=Float.parseFloat(args[1]);

		System.out.println("x= "+x);
		System.out.println("y="+y);
	}
}
