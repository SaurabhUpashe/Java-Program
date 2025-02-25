// WAP to init and display the array elements.(Using Predefined properties 'length')

class ArrayIntialExample
{
	public static void main(String []args)
	{
		int []x={45,12,62,96,32,56,74,88,21};

		System.out.println("Array elements Are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("   "+x[i]);
		}

		System.out.println("\n Array length is: "+x.length);
	}
}