// Array Intial and display using for()each loop

class ArrayForEachLoop
{
	public static void main(String []args)
	{
		int []x={85,47,65,23,14,95,65,74,84,12,32};
	
		System.out.println("Array "+x.length+" Elements: ");
		for(int s : x)
		{
			System.out.print("   "+s);
		}
	}
}