import java.util.*;
class Person
{
	String name;
	int age ;
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public int compareTo(Person other)
	{
		return Integer.compare(this.age,other.age);
	}
	public String toString()
	{
		return name + " (" + age + ")";
	}
}
class CustomPriorityQueAnon
{
	public static void main(String[] args) 
	{
		Comparator <Person> ob = (Person p1,Person p2)-> Integer.compare(p1.age,p2.age);

		PriorityQueue<Person> prq = new PriorityQueue<>(ob);
		prq.add(new Person("Saurabh",23));
		prq.add(new Person("Sayali",25));
		prq.add(new Person("Aryan",16));
        prq.add(new Person("Shubham", 13));

		while(!prq.isEmpty())
		{
			System.out.println(prq.poll());
		}
		
	}
}
