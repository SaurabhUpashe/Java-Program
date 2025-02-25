class Demo
{
	private int x;
	private double y;
	public Demo()
	{
		x=10;
		y=23.69;
	}
	public Demo(int a,double b)
	{
		x=a;
		y=b;
		System.out.println("Parameterised Constructer: ");
	}
	public void display()
	{
		System.out.println("x: "+x+"\t y: "+y);
	}
}
class Demopara 
{
	public static void main(String[] args) 
	{
		Demo ob = new Demo();
		ob.display();

		Demo ob1 = new Demo(58,98.03);
		ob1.display();

	}
}
