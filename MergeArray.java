// Merging two array

import java.io.*;
class MergeArray
{
	public static void main(String []args)throws Exception
	{
		int []x = new int[5];
		int []y = new int[5];
		int []z = new int[x.length+y.length];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int i=0,j=0,cnt=0;
		System.out.println("Enter "+x.length+" array Elemnt: ");
		for(i=0;i<x.length;i++)
		{
			x[i]=Integer.parseInt(br.readLine());
			z[cnt]=x[i];
			cnt++;
		}

		System.out.println("Enter "+y.length+" array Elemnt: ");
		for(i=0;i<x.length;i++)
		{
			y[i]=Integer.parseInt(br.readLine());
			z[cnt]=y[i];
			cnt++;
		}

		System.out.println("First Array is: ");
		for(i=0;i<x.length;i++)
		{
			System.out.print("  "+x[i]);
		}

		System.out.println("");
		System.out.println("Second Array is: ");
		for(i=0;i<x.length;i++)
		{
			System.out.print("  "+y[i]);
		}

		System.out.println("");
		System.out.println("Merge Array is: ");
		for(i=0;i<z.length;i++)
		{
			System.out.print("  "+z[i]);
		}

		for(i=0;i<z.length;i++)
		{
			for(j=0;j<z.length;j++)
			{
				if(z[i]<z[j])
				{
					int tmp=z[i];			
					z[i]=z[j];
					z[j]=tmp;
				}
			}
		}

		System.out.println("");
		System.out.println(" Sorted Merge Array is: ");
		for(i=0;i<z.length;i++)
		{
			System.out.print("  "+z[i]);
		}
		

	}
}