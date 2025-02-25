import java.util.*;
class ExamplePriorityQueue 
{
	public static void main(String[] args) 
	{
		Queue<Integer> ob = new PriorityQueue<>();
		ob.add(4);
		ob.add(3);
		ob.add(12);
		ob.add(45);
		ob.add(24);
		ob.add(11);
		ob.add(2);
		ob.add(18);
		ob.add(1);

		System.out.println("Priority Queue is: "+ob);
	}
}
