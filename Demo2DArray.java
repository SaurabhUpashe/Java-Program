// intia 2D Array

class Demo2DArray
{
	public static void main(String []args)
	{
		int i,j;
		int [][]x = {{11,22,33,44},{12,34,56,78},{10,20,30,40}};

		System.out.println("2D Array is: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.println();
		}
	}
}