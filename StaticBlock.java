class ExampleStaticBlock
{
	static int x;
	static double y;
	static boolean z;
}
class StaticBlock 
{
	public static void main(String[] args) 
	{
		System.out.println("X: "+ExampleStaticBlock.x);
		System.out.println("y: "+ExampleStaticBlock.y);
		System.out.println("z: "+ExampleStaticBlock.z);
	}
}
