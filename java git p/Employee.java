import java.util.Scanner;
class Employee
{
	private int id;
	private String nm;

	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee name :");
		nm=sc.nextLine();
		System.out.println("Enter the Id :");
		id=sc.nextInt();
	}
	public void output()
	{
		System.out.println("Name:- "+nm+"\t id:- "+id);
	}
}
class MainEmp
{
	public static void main(String[] args) 
	{
		 Employee e=new Employee();
		 e.input();
		 e.output();

		 Employee e1=new Employee();
		 e1.input();
		 e1.output();
	}
}
