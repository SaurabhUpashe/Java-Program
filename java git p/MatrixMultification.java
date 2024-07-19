import java.util.*;
class MatrixMultification
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x[][]=new int[3][3];
		int y[][]=new int[3][3];
		int [][]z=new int[3][3];

		int i,j,k;

		System.out.println("Enter the First Matrix 3*3:");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				x[i][j]=sc.nextInt();
			}
			System.out.println();
		}

		System.out.println("Enter the Second Matrix 3*3:");
		for(i=0;i<y.length;i++)
		{
			for(j=0;j<y[i].length;j++)
			{
				y[i][j]=sc.nextInt();
			}
			System.out.println();
		}

		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				z[i][j]=0;
				for(k=0;k<x[i].length;k++)
				{
					z[i][j]=z[i][j]+(x[i][k]*y[k][j]);
				}
			}

		}
		System.out.println("2D Matrix Multification: ");
		for(i=0;i<x.length;i++)
		{
			for(j=0;j<x[i].length;j++)
			{
				System.out.print("  "+x[i][j]);
			}
			System.out.print("\t");
			for(j=0;j<y[i].length;j++)
			{
				System.out.print("  "+y[i][j]);
			}
			System.out.print("\t");
			for(j=0;j<z[i].length;j++)
			{
				System.out.print("  "+z[i][j]);
			}
			System.out.print("\n");

		}
	}
}
