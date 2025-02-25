class Demo2DForEachLoop
{
	public static void main(String []args)
	{
		int [][]x ={{11,22,33,44},{14,25,36,74},{15,25,35,45}};

		System.out.println("2D array is: ");
		for(int t[] : x)
		{
			for(int j : t)
			{
				System.out.print("  "+j);
			}
			System.out.println();
		}
	}
}