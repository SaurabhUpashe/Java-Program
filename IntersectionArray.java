// find the Intersection in Two array

import java.util.Scanner;
class IntersectionArray
{
	public static void main(String []args)
	{
		int []arr1 = new int[5];
		int []arr2 = new int[5];

		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First "+arr1.length+" Array Element: ");
		for(i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}

		System.out.println("Enter Second "+arr2.length+" Array Element: ");
		for(i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}

		System.out.println("Intersetion List: ");
		for(i=0;i<arr1.length;i++)
		{
			for(j=0;j<arr1.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.print("  "+arr1[i]);
				}	
			}

			
		}
		
	}
}