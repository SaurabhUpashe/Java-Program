class ExampleOfStaticBlock
{
	static int x;
	static double y;
	static boolean z;
	static
	{
		x=10;
		y=x*x;
		z=false;
		System.out.println("static Intialization Block-1: ");
	}
	static
	{
		x=30;
		y=x*x/2.6;
		z=true;
		System.out.println("static Intialization Block-2: ");
	}
	static
	{
		x=40;
		y=x*x*x;
		z=true;
		System.out.println("static Intialization Block-3: ");
	}
}
class MainStaticBlock
{
	public static void main(String[] args) 
	{
		System.out.println("X: "+ExampleOfStaticBlock.x);
		System.out.println("y: "+ExampleOfStaticBlock.y);
		System.out.println("z: "+ExampleOfStaticBlock.z);
	}
}