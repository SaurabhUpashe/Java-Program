import java.util.*;
class JaggedArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,j,scnt=0;
		int x[][]=new int[3][];
		System.out.println("Enter 3 Student Details: ");
		for(i=0;i<3;i++)
		{
			System.out.println("Enter the Sub Count of "+(i+1)+" Student");
			scnt=sc.nextInt();
			
			x[i]=new int[scnt];
			for(j=0;j<scnt;j++)
			{
				System.out.println("Sub"+(j+1)+" : ");
				x[i][j]=sc.nextInt();
			}

		}
		System.out.println("Sudent Details: ");
		System.out.println("Marks:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				System.out.print("\t "+x[i][j]);
			}
			System.out.println();
		}
	}
}
