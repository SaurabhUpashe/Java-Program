// Enter the array of any size and display the even and odd nos Count from it.

import java.io.*;
class EvenAndOdd
{
	public static void main(String []args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int []arr = new int[10];
		
		System.out.println("Enter 10 Array Element: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}

		int ec=0;
		int oc=0;
		for(int i=0;i<10;i++)
		{
			if(arr[i]%2==0)
			{
				ec++;
			}
			else
			{
				oc++;
			}
		}

		System.out.println("Array Element Are: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("  "+arr[i]);
		}

		System.out.println("Even Count: "+ec);
		System.out.println("odd Count: "+oc);

	}
}