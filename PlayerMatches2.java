// WAP to store theruns scored by M players in N matches. (Row -> runtime = Cols -> runtime)

import javax.swing.JOptionPane;
class PlayerMatches2
{
	public static void main(String []args)throws Exception
	{
		int i,j; 
		
		int pc = Integer.parseInt(JOptionPane.showInputDialog("Enter your Player Count: "));
		int mc = Integer.parseInt(JOptionPane.showInputDialog("Enter your Match count: "));

		int [][] x = new int[pc][mc];

		System.out.println("Enter the "+x.length+" player Matches");
		for(i=0;i<x.length;i++)
		{
			System.out.println("player "+(i+1)+" :");
			for(j=0;j<mc;j++)
			{
				x[i][j]=Integer.parseInt(JOptionPane.showInputDialog("Match "+(j+1)+" Score:"));
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