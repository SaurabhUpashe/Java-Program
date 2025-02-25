import java.util.*;
class UsingAnotherPriorityQueue 
{
	public static void main(String[] args) 
	{
		List <Integer> list = new ArrayList<>();
		list.add(4);
		list.add(3);
		list.add(12);
		list.add(45);
		list.add(24);
		list.add(11);
		list.add(2);
		list.add(18);
		list.add(1);

		Queue<Integer> queue1 = new PriorityQueue<>(list);
		System.out.println("First Priority Queue: "+queue1);

		Queue<Integer> queue2 = new PriorityQueue<>(queue1);
		System.out.println("Second Priority Queue: "+queue1);

	}
}
