class jaggedArrayExample
{
	public static void main(String []args)
	{
		int [][] arr ={{14,2,56,78,96},{1,23,45},{36,74,85,96,47,95,25},{78,25}};

		System.out.println("--------Matches Record-------");
		for(int i=0;i<arr.length;i++)
		{	
			System.out.print("Player "+(i+1)+" :");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("   "+arr[i][j]);
			}
			System.out.print("\n");
		}
	}
}