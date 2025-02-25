// Data input using Scanner in fix size array.

import java.util.Scanner;
class ArrayIOUsingScanner
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int [5];

		System.out.println("Enter "+arr.length+" element: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Array Element: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("   "+arr[i]);
		}

		
		
	}

}