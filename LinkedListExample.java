import java.util.*;
class LinkedListExample 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> l1 = new LinkedList<>();
		//System.out.println(l1.remove());//generate exception if LinkedList is empty
		System.out.println(l1.poll());//return null if LinkedList is empty

		ArrayList<Integer> arlst = new ArrayList<>();
		arlst.add(12);
		arlst.add(23);
		arlst.add(90);
		arlst.add(32);
		arlst.add(100);
		System.out.println("List: "+arlst);
		LinkedList <Integer> l2 = new LinkedList<>(arlst);//passes other collection to Linkedlist constructer
		System.out.println("Element at Start: "+l2.element());
		System.out.println("Element at getFirst: "+l2.getFirst());
		System.out.println("Element at getlast: "+l2.getLast());
		System.out.println("Element at peek: "+l2.peek());
		System.out.println("Element at peekfirst: "+l2.peekFirst());
		System.out.println("Element at poll: "+l2.poll());
		System.out.println("Element at pop: "+l2.pop());
		System.out.println("Element at remove: "+l2.remove());

		System.out.println("LinkedList: "+l2);

	}
}
