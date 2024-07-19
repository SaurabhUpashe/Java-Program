class ParaConstructer
{
	private int x;
	private double y;

	public ParaConstructer(int x,double y)
	{
		System.out.println("Its is Parameterized Constructer: ");
		this.x=x;
		this.y=y;
	}
	public void show()
	{
		System.out.println("X is: "+x+"\t Y is: "+y);
	}
} 
class MainParaConstructer
{
	public static void main(String[] args)											
	{
		ParaConstructer p=new ParaConstructer(11,56.32);
		p.show();

		ParaConstructer p1=new ParaConstructer(96,23.65);
		p1.show();

		ParaConstructer p2=new ParaConstructer(74,52.12);
		p2.show();
	}
}
