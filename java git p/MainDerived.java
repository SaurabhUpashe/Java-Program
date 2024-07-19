import java.util.Scanner;
class Parents
{
	private int x;
	public Parents()
	{
		System.out.println("It is Parents default Class: ");
		x=10;
	}
	public Parents(int a)
	{
		System.out.println("Its is parents Para class: ");
		x=a;
	}
	public void Output()
	{
		System.out.println("X value is: "+x);
	}
}
class Derived extends Parents
{
	private int y;
	public Derived()
	{
		System.out.println("Its is Derived Default 1 class: ");
		y=100;
	}
	public Derived(int a,int b)
	{
		super(a);
		System.out.println("Its Derived Para 1 class: ");
		y=b;
	}
	public void Out()
	{
		Output();
		System.out.println("Y is: "+y);
	}
}
class  MainDerived
{
	public static void main(String[] args) 
	{
		Derived s=new Derived();
		s.Out();
		
		Derived s1=new Derived(11,56);
		s1.Out();
	}
}
