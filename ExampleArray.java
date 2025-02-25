// WAP to display the addition of all rows/cols in 2D array after/below

import java.util.Scanner;
class ExampleArray
{
	public static void main(String []args)
	{
		int i,j,tot,totcol;
		Scanner sc = new Scanner(System.in);

		int [][]arr = new int [3][4];

		System.out.println(" Enter 3*4 Array size Element: ");
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println(" Enter 3*4 Array size Element: ");
		for(i=0;i<arr.length;i++)
		{
			tot=0;
			for(j=0;j<arr[i].length;j++)
			{
				tot=tot + arr[i][j];
				System.out.print("  "+arr[i][j]);
			}
			System.out.print(" -----> ");
			System.out.print("   "+tot);
			System.out.println();
		}

		// int colsum[] = new int [3];
		for(i=0;i<arr.length;i++)
		{
			int colsum=0;
			for(j=0;j<arr[i].length;j++)
			{
				
				colsum+=arr[j][i];
				arr[i][j]=arr[j][i];
				System.out.print("  "+arr[i][j]);
			}
			System.out.print(" -----> ");
			System.out.print("   "+colsum);
			System.out.println();
		}
	}
}