import java.util.*;
class Super
{
	private int x=0;
	public Super()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X: ");
		x=sc.nextInt();
	}
	public void ShowSuper()
	{
		System.out.println("X value is: "+x);
	}
}
class Derived extends Super
{
	private String nm="";
	private int age=0;
	private double per=0.0;
	public Derived()
	{
		Scanner pt=new Scanner (System.in);
		System.out.println("Enter the Student Name: ");
		nm=pt.nextLine();
		System.out.println("Enter the Student Age: ");
		age=pt.nextInt();
		System.out.println("Enter the Student Percentage: ");
		per=pt.nextDouble();
	}
	public void DerivedShow()
	{
		ShowSuper();
		System.out.println("Name: "+nm+"\t Age: "+age+"\t per: "+per);
	}
}
class Child extends Derived
{
	private int point=0;
	public Child()
	{
		System.out.println("Its is Default Construct: ");
		point=102;
	}
	public void showChild()
	{
		DerivedShow();
		System.out.println("Point is "+point);
	}
}
class MainChild 
{
	public static void main(String[] args) 
	{
		Child c=new Child();
		c.showChild();
	}
}
