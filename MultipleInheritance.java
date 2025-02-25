import java.util.Scanner;
class Person
{
	private String name="";
	private int age;
	public void in()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Person Name: ");
		name=sc.nextLine();

		System.out.println("Enter the Person age: ");
		age=sc.nextInt();
	}
	public void out()
	{
		System.out.println("Name: "+name+"\t Age: "+age);
	}
}
class Student extends Person
{
	private int rno;
	private double per;
	public void input()
	{
		in();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Roll No: ");
		rno=sc.nextInt();

		System.out.println("Enter the Student Percentage: ");
		per=sc.nextDouble();
	}
	public void output()
	{
		out();
		System.out.println("Roll No: "+rno+"\t Percentage: "+per);
	}

}
class Sport extends Student
{
	private int point;
	public void set()
	{
		input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Point in Sport: ");
		point=sc.nextInt();
	}
	public void get()
	{
		output();
		System.out.println("Points: "+point);
	}
}
class MultipleInheritance 
{
	public static void main(String[] args) 
	{
		Sport ob = new Sport();
		ob.set();
		ob.get();
	}
}
