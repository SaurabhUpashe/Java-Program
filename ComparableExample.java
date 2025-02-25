import java.util.*;
class Student implements Comparable<Student>
{
	public int rollno;
	String name;
	public Student(int rollno,String name)
	{
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public int compareTo(Student ob)
	{
		return this.rollno - ob.rollno; // Ascending order sorting
		//return ob.rollno - this.rollno; // deascending order sorting
	}
}
class ComparableExample
{
	public static void main(String[] args) 
	{
		/*Student s1 = new Student(12,"Dhananjay");
		Student s2 = new Student(11,"saurabh");
		Student s3 = new Student(15,"sayali");
		Student s4 = new Student(21,"sangita");*/

		List<Student> ob = new ArrayList<>();
	    ob.add(new Student(3,"saurabh"));
		ob.add(new Student(2,"Aryan"));
		ob.add(new Student(1,"Shubham"));
		ob.add(new Student(4,"Sayali")); 

		/*ob.add(s1);We also write like this
		ob.add(s2);
		ob.add(s3);
		ob.add(s4);*/

		Collections.sort(ob);

		for(Student s5 : ob)
		{
			System.out.println(s5.rollno+" -- "+s5.name);
		}
	}
}
