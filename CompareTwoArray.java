 // Compare Two Array

import java.util.Scanner;
class CompareTwoArray
{
	public static void main(String []args)
	{
		int []x = new int[5];
		int []y = new int[5];

		Scanner sc = new Scanner(System.in);
			
		int i=0,flg=0;
		System.out.println("Enter First "+x.length+" array Element: ");
		for(i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();
			
		}

		System.out.println("Enter Second "+y.length+" array Element: ");
		for(i=0;i<x.length;i++)
		{
			y[i]=sc.nextInt();
			
		}

		if(x.length==y.length)
		{
			flg=0;
			for(i=0;i<x.length;i++)
			{
				if(x[i]!=y[i])
				{
					flg=1;
					break;
				}
			}
		}
		else
		{
			flg=1;
		}
		if(flg==0)
		{
			System.out.println("Array is Matching: ");
		}
		else
		{
			System.out.println("Array is not Matching: ");
		}


	}
}