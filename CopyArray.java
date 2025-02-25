// WAP to copy the elements from one array into another array.

import java.util.Scanner;
class CopyArray
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int x[] = new int[10];
		int []y = new int[x.length];

		System.out.println("Enter the 10 Array Element: ");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
			y[i]=x[i];	
		}

		
		System.out.println("origin Array Element: ");
		for(int no : x)
		{
			System.out.print("  "+no);	
		}
		
		System.out.println("\n");
		System.out.println("Copy Array Element: ");
		for(int no : x)
		{
			System.out.print("  "+no);	
		}


		
	}
}