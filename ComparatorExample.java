import java.util.*;
class Student
{
	public int rollno;
	String name;
	public Student(int rollno,String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
}
class NameComparator implements Comparator<Student>
{
	//@Override
	public int compare(Student ob1 , Student ob2)
	{
		return ob1.name.compareTo(ob2.name);
		//return ob1.rollno - ob2.rollno;//ascenting order sort
	}
}
class ComparatorExample 
{
	public static void main(String[] args) 
	{
		List<Student> ob = new ArrayList<>();
		ob.add(new Student(3,"saurabh"));
		ob.add(new Student(2,"Aryan"));
		ob.add(new Student(1,"Shubham"));
		ob.add(new Student(4,"Sayali")); 

		Collections.sort(ob, new NameComparator());//Internally call compare()

		for(Student s : ob)
		{
			System.out.println(s.rollno+" = "+s.name);
		}
	}
}
