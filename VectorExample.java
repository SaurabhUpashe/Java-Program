import java.util.Vector;
class VectorExample 
{
	public static void main(String[] args) 
	{
		Vector<String> car = new Vector<>(5);//Bydefault capacity is 10
		// Displaying initial size and capacity
		System.out.println("Intial Capacity: "+car.capacity());
		System.out.println("Intial Size: "+car.size());

		car.add("Creata");
		car.add("KIA");
		car.add("Swift");
		car.add("Bently");
	
		System.out.println("After adding 4 Cars ");
		System.out.println("Intial Capacity: "+car.capacity());
		System.out.println("Intial Size: "+car.size());


		System.out.println("Hello World!");
	}
}
