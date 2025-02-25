import java.util.Scanner;
import java.io.IOException;
class AgeException extends Exception
{
	private String exmsg;
	public AgeException(String msg)
	{
		super(msg);
		exmsg=msg;
	}
	public String toString()
	{
		return "Exception msg: "+exmsg;
	}
}
class Form
{
	private String name;
	private int age;
	private int id;
	private double marks;
	public void input() throws Exception
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name: ");
		name=sc.nextLine();

		System.out.println("Enter the age: ");
		age=sc.nextInt();
		if(age<18 || age>25)
		{
			throw new AgeException("Age is not within age window");
		}
		System.out.println("Enter the id: ");
		id=sc.nextInt();

		System.out.println("Enter the marks: ");
		marks=sc.nextDouble();
	}
	void display()
	{
		System.out.println("Info: Name: "+name+"\t id: "+id+"\t age: "+age+"\t marks: "+marks);
	}
}

class UserDefindException
{
	public static void main(String []args)
	{
		Form f=new Form();
		try 
		{
			f.input();
			f.display();
		} 
		catch(Exception e) 
		{
		    System.out.println("Info:"+e);
			System.out.println("===========================");
			System.out.println("Info: "+e.getMessage());
			System.out.println("Info:");
			e.printStackTrace();
		}
		System.out.println("End of program");
	}
}
