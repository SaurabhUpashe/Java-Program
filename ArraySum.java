// Write a program to add all array elements

import java.util.Scanner;
class ArraySum
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int []arr = new int[10];
		
		System.out.println("Enter 10 Array Element: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}

		int sum=0;
		
		for(int i=0;i<10;i++)
		{
			sum=sum+arr[i];
		}

		System.out.println("Array Element Are: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("  "+arr[i]);
		}

		System.out.println("Array Sum : "+sum);
		
	}
}