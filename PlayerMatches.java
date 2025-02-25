// WAP to store theruns scored by N players in 4 matches. (Row -> runtime = Cols -> fix)

import java.util.Scanner;
class PlayerMatches
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Player count");
		int pc = sc.nextInt();

		int [][]arr = new int [pc][4];

		System.out.println("Enter the "+arr.length+" player Matches");
		for(int i=0;i<pc;i++)
		{
			System.out.println("player "+(i+1)+" :");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Match "+(j+1)+" Score:");
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("----------Matches Record--------");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("player "+(i+1)+" :");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("   "+arr[i][j]);
			}
			System.out.println();
		}
	}
}