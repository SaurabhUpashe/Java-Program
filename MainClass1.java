class Member
{
	private int x;
	protected int y;
	int z;//default(package-private)
	public int t;
	public Member()
	{
		x=10;
		y=25;
		z=30;
		t=40;
	}
	public void Output()
	{
		System.out.println("\n X: "+x+"\t y: "+y+"\t Z: "+z+"\t t: "+t);
	}
}
class  MainClass1
{
	public static void main(String[] args) 
	{
		Member ob = new Member();
		ob.Output();

		System.out.println("\n X: "+ob.x+"\t y: "+ob.y+"\t Z: "+ob.z+"\t t: "+ob.t);
	}
}
