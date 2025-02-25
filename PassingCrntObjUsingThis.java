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
		this(id,"Sayali",age,-1.9);
	}
	public Person(int id,String name,int age,double salary)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.salary=salary;
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
		if(isWorking(this))
				System.out.println("Id: "+id+"\t Name: "+name+"\t Age: "+age+"\t Salary: "+salary);
		
	}
	private boolean isWorking(Person t)
	{
		if(salary>0)
			return true;
		else
			return false;
	}
}
class PassingCrntObjUsingThis
{
	public static void main(String[] args) 
	{
		Person ob1 = new Person();
		ob1.output();
	
		Person ob2 = new Person(12,26);
		ob2.output();
		ob2.input(12,"sangita",45,-7.6);

		System.out.println("Person Details: ");
		ob1.output();
		ob2.output();
	}
}
