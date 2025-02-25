import java.util.*;
class Person implements Comparable<Person>
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
class CustomForPriorityQue 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Person> prq = new PriorityQueue<>();
		prq.add(new Person("Saurabh",23));
		prq.add(new Person("Sayali",25));
		prq.add(new Person("Aryan",16));
        prq.add(new Person("Shubham", 13));

		while(!prq.isEmpty())
		{
			System.out.println(prq.poll());
		}
		//System.out.println("Hello World!");
	}
}
