import java.util.Scanner;
class Student
{
	private int id;
	private double per;

	public void input(int x,double y)
	{
		id=x;
		per=y;
	}
	public void show()
	{
		System.out.println("student id:  "+id+"\t Student percentage: "+per);
	}
}
class MainStudent
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		int sid=0;
		double sper=0.0;
		
		System.out.println("Enter the Student Id: ");
		sid=sc.nextInt();
		System.out.println("Enter the Student percentage: ");
		sper=sc.nextDouble();

		s.input(sid,sper);
		s.show();

		Student s1=new Student();
		System.out.println("Enter the Student Id: ");
		sid=sc.nextInt();
		System.out.println("Enter the Student percentage: ");
		sper=sc.nextDouble();

		s1.input(sid,sper);
		s1.show();
	}
}

