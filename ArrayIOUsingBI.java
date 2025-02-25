// Data input using BufferedReader and inputStreamReader in fix size array.

import java.io.InputStreamReader;
import java.io.BufferedReader;
class ArrayIOUsingBI
{
	public static void main(String []args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int []arr = new int[10];
		System.out.println("Enter 10 Array Element: ");
		for(int i=0;i<10;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Array Element: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("  "+arr[i]);
		}
	}
}