import java.util.Scanner;
import java.io.IOException;
class Form
{
	private String name;
	private int age;
	private int id;
	private double marks;
	public void input() throws ArithmeticException
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name: ");
		name=sc.nextLine();

		System.out.println("Enter the age: ");
		age=sc.nextInt();
		if(age<18 || age>25)
		{
			throw new ArithmeticException("Age is not within age window");
			// As it is unchecked exception, will compile sucessfully but generate 
			//the exception when age is not within age window

			//throw new IOException("Age is not within age window");
			// As it is checked exception it will asking for exception handling 
			//at the time of compilation

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

class ExceptionChoose
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
		}
		System.out.println("End of program");
	}
}
