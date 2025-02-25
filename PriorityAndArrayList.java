import java.util.*;
class PriorityAndArrayList 
{
	public static void main(String[] args) 
	{
		List<Integer> arlst = new ArrayList<>();
		arlst.add(4);
		arlst.add(3);
		arlst.add(12);
		arlst.add(45);
		arlst.add(24);
		arlst.add(11);
		arlst.add(2);
		arlst.add(18);
		arlst.add(1);
		PriorityQueue<Integer> prq = new PriorityQueue<>(arlst);
		System.out.println("Priority Queue: "+prq);
	}
}
