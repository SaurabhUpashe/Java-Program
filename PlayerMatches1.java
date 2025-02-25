// WAP to store theruns scored by 3 players in N matches. (Row -> fix = Cols -> runtime)

import java.io.InputStreamReader;
import java.io.BufferedReader;
class PlayerMatches1
{
	public static void main(String []args)throws Exception
	{
		int i,j;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Match count: ");
		int mc = Integer.parseInt(br.readLine());

		int [][] x = new int[3][mc];

		System.out.println("Enter the "+x.length+" player Matches");
		for(i=0;i<x.length;i++)
		{
			System.out.println("player "+(i+1)+" :");
			for(j=0;j<mc;j++)
			{
				System.out.println("Match "+(j+1)+" Score:");
				x[i][j]=Integer.parseInt(br.readLine());
			}
		}

		System.out.println("----------Matches Record--------");
		for(i=0;i<x.length;i++)
		{
			System.out.print("player "+(i+1)+" :");
			for(j=0;j<x[i].length;j++)
			{
				System.out.print("   "+x[i][j]);
			}
			System.out.println();
		}
	}
}