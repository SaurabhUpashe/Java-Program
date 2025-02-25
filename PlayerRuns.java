// WAP to input runs scored by 4 players in 5 matches display all records ending with no of 50's and 100's

import java.util.Scanner;
class PlayerRuns
{
	public static void main(String []args)
	{
		int i,j,fcnt,hcnt;
		Scanner sc = new Scanner(System.in);

		int [][]arr = new int [4][5];

		System.out.println(" Enter 4*5 Array size Element: ");
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

		
		for(i=0;i<arr.length;i++)
		{
			fcnt=0;
			hcnt=0;
			for(j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]>=50 && arr[i][j]<100)
				{
					fcnt++;
				}
				else if(arr[i][j]>=100)
				{
					hcnt++;
				}
				System.out.print("    "+arr[i][j]);
			}
			System.out.print(" -----> ");
			System.out.print("\t Fivty count: "+fcnt+" \t Hundred count: "+hcnt);
			System.out.println();
		}

	}
}