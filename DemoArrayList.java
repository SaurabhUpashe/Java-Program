import java.util.*;
class DemoArrayList 
{
	public static void main(String[] args) 
	{
		Collection c = new ArrayList();//Base interface refernce refer to the child object(ArrayList Object)
		c.add("Hello");
		c.add(23);
		c.add("Good");
		c.add(45.23);
		System.out.println("Collection c : "+c);

		List ls = new ArrayList();//Base interface refernce refer to the child object(ArrayList Object)
		ls.add("Saurabh");
		ls.add("sayali");
		ls.add(25);
		ls.add(31.3);
		System.out.println("List  ls : "+ls);

		ArrayList al = new ArrayList();
		al.add("Dhananjay");
		al.add("Sangita");
		System.out.println("ArrayList  al : "+al1);
	}

}
