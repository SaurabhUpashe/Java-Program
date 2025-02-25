import java.util.Scanner;
class Person
{
	private int id;
	private String name;
	private int age;
	private double salary;
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
	public void output()
	{
		System.out.println("Id: "+id+"\t Name: "+name+"\t Age: "+age+"\t Salary: "+salary);
	}
	Person findElder(Person a)
	{
		if(a.age>age)
			return a;
		else
			return this;
	}
}
class PersonThisKeyword
{
	public static void main(String[] args) 
	{
		Person ob1 = new Person();
		ob1.input();

		Person ob2 = new Person();
		ob2.input();

		System.out.println("Person Details: ");
		ob1.output();
		ob2.output();

		Person p = ob1.findElder(ob2);

		System.out.println("Elder Details: ");
		p.output();
	}
}
