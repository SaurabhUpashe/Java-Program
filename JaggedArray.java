import java.util.Scanner;
class JaggedArray
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Player count");
		int pcnt = sc.nextInt();

		int [][]arr = new int [pcnt][];

		System.out.println("Enter the "+arr.length+" player Matches");
		for(int i=0;i<pcnt;i++)
		{
			System.out.println("player "+(i+1)+" :");
			System.out.println("Enter "+(i+1)+" player Matches Count");
			int mc = sc.nextInt();
			arr[i] = new int[mc];
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