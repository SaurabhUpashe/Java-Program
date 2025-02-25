// Array - Input and Display

import java.io.InputStreamReader;
import java.io.BufferedReader;
class IO2DArray
{
	public static void main(String []args)throws Exception
	{
		int i,j;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int [][]arr = new int[3][5];
		System.out.println("Enter 3*5 Array elemnt: ");
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}

		System.out.println("Array Elemnt Are: ");
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				System.out.print("  "+arr[i][j]);
			}
			System.out.print("\n");
		}
	}
}