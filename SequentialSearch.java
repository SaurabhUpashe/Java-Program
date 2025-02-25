// Using Sequential Search

import java.util.Scanner;
class SequentialSearch
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		int []arr = new int[10];

		System.out.println("Enter the 10 Array Element: ");
		int i;
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}	

		System.out.println("Enter The Number you want to search in array: ");
		int no=sc.nextInt();

		int cnt=0;
		int pos=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==no)
			{
				cnt++;
				pos=i;
			}
		}

		if(cnt>0)
		{
			System.out.println("Number is present in array at "+(pos+1)+" postion");
		}
		else
		{
			System.out.println("Number is not present in array");
		}
		
		
	}
}