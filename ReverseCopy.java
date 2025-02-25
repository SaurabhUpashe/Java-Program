//reverse Copy Array

import java.io.*;
class ReverseCopy
{
	public static void main(String []args)throws Exception
	{
		int []x = new int[10];
		int []y = new int[10];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the "+x.length+" Element: ");
		for(int i=0;i<10;i++)
		{
			x[i]=Integer.parseInt(br.readLine());
			y[i]=x[i];
		}

		System.out.println("Orignal Array: ");
		for(int i=0;i<10;i++)
		{
			System.out.print("   "+x[i]);
		}

		System.out.println("");
		System.out.println("Copy Array: ");
		for(int i=0;i<10;i++)
		{
			System.out.print("   "+y[i]);
		}

		System.out.println("");
		System.out.println("Reverse Array: ");
		for(int i=x.length-1;i>=0;i--)
		{
			System.out.print("   "+y[i]);
		}



		
	}
}
