import java.util.*;
class CollectiosDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ob = new ArrayList<>();
		ob.add(12);
		ob.add(32);
		ob.add(142);
		ob.add(127);
		ob.add(42);
		ob.add(16);
		ob.add(112);
		System.out.println("Entered Arraylist is: "+ob);

		ob.sort((x,y)-> Integer.compare(x,y));
		System.out.println("Entered(ascending) Arraylist is: "+ob);

		ob.sort((x,y)->Integer.compare(y,x));
		System.out.println("Entered(deascending) Arraylist is: "+ob);

		//Using Collection
		Collections.sort(ob);
		System.out.println("Entered(ascending) Arraylist Using Collections: "+ob);

		Collections.sort(ob,(x,y) -> Integer.compare(y,x));
		System.out.println("Entered(deascending) Arraylist Using Collections: "+ob);

	}
}
