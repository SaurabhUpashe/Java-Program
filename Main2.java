import java.util.Scanner;
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
			throw new ArithmeticException("Age is not within age window");
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

class Main2
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
		    System.out.println("Info saurabh Uapshe:"+e);
		}
		System.out.println("End of program");
	}
}
