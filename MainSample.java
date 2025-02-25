import java.util.*;
class Sample
{
	private int x;
	private String name;
	private double y;
	public Sample()
	{
		x=10;
		name="Saurabh";
		y=58.69;
		System.out.println("Default Construter: ");
	}
	public Sample(int a)
	{
		System.out.println("Default Construter-1: ");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the any Name:");
		name=sc.nextLine();

		System.out.println("Enter the Int Value:");
		x=sc.nextInt();

		System.out.println("Enter the Double Value:");
		y=sc.nextDouble();

		
	}
	public Sample(int a,String s,double b)
	{
		System.out.println("para Construter-2: ");
		x=a;
		name=s;
		y=b;
	}
	public Sample(Sample t)
	{
		x=t.x;
		name=t.name;
		y=t.y;
		System.out.println("Copy Construter: ");
	}
	public void output()
	{
		System.out.println("X: "+x+"\t Name: "+name+"\t Y: "+y);
	}
}
class  MainSample
{
	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		Sample s2 = new Sample(10);
		Sample s3 = new Sample(20,"Sayali",85.14);

		s1.output();
		s2.output();
		s3.output();

		Sample s4 = new Sample(s2);
		s4.output();

		Sample s5 = new Sample(s3);
		s5.output();






		System.out.println("Hello World!");
	}
}
