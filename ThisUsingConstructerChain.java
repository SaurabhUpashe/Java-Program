import java.util.Scanner;
class Person
{
	private int id;
	private String name;
	private int age;
	private double salary;
	public Person()
	{
		this(1,"saurabh",23,7.3);
	}
	public Person(int id, int age)
	{
		this(id,"Sayali",age,8.9);
	}
	public Person(int id,String name,int age,double salary)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Name: ");
		name=sc.nextLine();
		
		System.out.println("Enter the id: ");
		id=sc.nextInt();

		System.out.println("Enter the Age: ");
		age=sc.nextInt();

		System.out.println("Enter the salary: ");
		salary=sc.nextDouble();

	}
	public void input(int id, String name ,int age,double salary)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public void output()
	{
		System.out.println("Id: "+id+"\t Name: "+name+"\t Age: "+age+"\t Salary: "+salary);
	}
}
class ThisUsingConstructerChain
{
	public static void main(String[] args) 
	{
		Person ob1 = new Person();
		ob1.output();
		ob1.input();

		Person ob2 = new Person(12,26);
		ob2.output();
		ob2.input(12,"sangita",45,7.6);

		System.out.println("Person Details: ");
		ob1.output();
		ob2.output();
	}
}