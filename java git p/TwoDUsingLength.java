class TwoDUsingLength
{
	public static void main(String[] args) 
	{
		int x[][]={{11,22,33},{44,55,95},{78,25,132},{11,85,65}};
		int i,j;
		
		System.out.println("2D array Representation: ");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.println();
		}

	}
}