// Using Selection sort


import java.io.*;
class SelctionSort
{
	public static void main(String []args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int []x = new int[5];
		int i;
		System.out.println("Enter "+x.length+" Array: ");
		for(i=0;i<x.length;i++)
		{
			x[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Orignal Array: ");
		for(i=0;i<x.length;i++)
		{		
			System.out.print("   "+x[i]);
		}

		for(i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
				if(x[i]<x[j])
				{
					int tmp=x[i];
					x[i]=x[j];
					x[j]=tmp;
				}
			}
		}

		System.out.println("");
		System.out.println("Sort Array: ");
		for(i=0;i<x.length;i++)
		{		
			System.out.print("   "+x[i]);
		}

	}
}

