import java.util.Scanner;
class Form
{
	private String name;
	private int id;
	private int age;
	private int marks;
	public void input() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Your Name: ");
		name=sc.nextLine();

		System.out.println("Enter the Your ID: ");
		id=sc.nextInt();

		System.out.println("Enter the Your Age: ");
		age=sc.nextInt();
		if(age<18 ||age>25)
		{
			throw new ArithmeticException("Age is not valid: ");
		}

		System.out.println("Enter the Your Marks: ");
		marks=sc.nextInt();

	}
	public void output()
	{
		System.out.println("\nName: "+name+"\t ID: "+id+"\t Age: "+age+"\t Marks: "+marks);
	}
}
class UsingThrowKeyword 
{
	public static void main(String[] args) 
	{
		Form f = new Form();
		try
		{
			f.input();
		    f.output();
		}
		catch (Exception e)
		{
			System.out.println("Info: "+e);
		}
		
		//System.out.println("Hello World!");
	}
}
