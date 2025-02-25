import java.util.*;
class MaxHeapImplement 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> prq = new PriorityQueue<>();
		prq.add(4);
		prq.add(3);
		prq.add(12);
		prq.add(45);
		prq.add(24);
		prq.add(11);
		prq.add(2);
		prq.add(18);
		prq.add(1);
		System.out.println("Max Heap: "+prq);
		prq.remove(3);
		System.out.println("After Remove Heap: "+prq);
	}
}
