import java.util.*;
class Person
{
	private String nm="";
	private int x=0;
	{
		System.out.println("********PROGRAMMING********");
	}
	public void in()
	{
		System.out.println("Its parents Class");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Person Name: ");
		nm=sc.nextLine();
		System.out.println("Enter the X value");
		x=sc.nextInt();
	}
	public void out()
	{
		System.out.println("Its parents Class");
		System.out.println("Person Name: "+nm+"\t X is: "+x);
	}
}
class Student extends Person
{
	private int id;
	private double per;
	public void input()
	{
		
		in();
		System.out.println("Its Child Class");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student Id: ");
		id=sc.nextInt();
		System.out.println("Enter the Student Percentage");
		per=sc.nextDouble();
	}
	public void output()
	{
		out();
		System.out.println("Its Child Class");
		System.out.println("Student id: "+id+"\t Student percentage: "+per);
	}
}
class MainStudentInheritance
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.input();
		s.output();
	}
}
