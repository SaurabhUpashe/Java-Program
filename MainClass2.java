class Member
{
	private int x;
	protected int y;
	int z;//default(package-private)
	public int a;
	public Member()
	{
		x=10;
		y=25;
		z=30;
		a=40;
	}
	public void Output()
	{
		System.out.println("\n X: "+x+"\t y: "+y+"\t Z: "+z+"\t A: "+a);
	}
}
class MainClass2 extends Member
{
	public static void main(String[] args) 
	{
		Member ob = new Member();
		ob.Output();
		System.out.println("\n X: "+ob.x+"\t y: "+ob.y+"\t Z: "+ob.z+"\t A: "+ob.a);
	}
}
