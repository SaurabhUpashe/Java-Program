// Using Update Even no by 10 and odd no by 11

import java.util.Scanner;
class UpdateArray
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
			
		int []arr = new int [10];
		int i;
		System.out.println("Enter "+arr.length+" array Element: ");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}

		System.out.println("Array Element: ");
		for(i=0;i<arr.length;i++)
		{
			System.out.print("   "+arr[i]);
		}

		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				arr[i]=10;
			}
			else
			{
				arr[i]=11;
			}
		}
		

		System.out.println("");
		System.out.println("Update Array Element by 10 and 11: ");
		for(i=0;i<arr.length;i++)
		{
			System.out.print("   "+arr[i]);
		}


	}
}