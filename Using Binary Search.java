// Using Binary Search

import java.util.Scanner;
class BinarySearch
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

		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println("Enter The Number you want to search in array: ");
		int no=sc.nextInt();

		int start=0;
		int end=arr.length-1;
		int pos;
		for(i=0;i<arr.length;i++)
		{
			int mid=(start+end)/2;
			if(arr[mid]==no)
			{
				pos=mid;
				break;
			}
			else if(no<arr[mid])
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
		}

		if(pos>0)
		{
			System.out.println("Number is present in array at "+(pos+1)+" postion");
		}
		else
		{
			System.out.println("Number is not present in array");
		}
		
		
	}
}