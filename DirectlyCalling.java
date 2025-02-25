import java.util.*;
class Person
{
	String name;
	int age;
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		return name+"("+age+")";
	}
}
class DirectlyCalling
{
	public static void main(String[] args) 
	{
		PriorityQueue<Person> prq = new PriorityQueue<>((p1,p2)->p1.name.compareTo(p2.name));
		prq.add(new Person("Saurabh",23));
		prq.add(new Person("Sayali",25));
		prq.add(new Person("Shubham",13));
		prq.add(new Person("Aryan",16));

		while(!prq.isEmpty())
		{
			System.out.println(prq.poll());
		}		
	}
}
