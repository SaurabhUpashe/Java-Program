import javax.swing.JOptionPane;
class ImplementingPointerUsingArray
{
	public static void main(String []args)
	{
		int cnt;
		cnt=Integer.parseInt(JOptionPane.showInputDialog("Enter Your Count: "));

		int []x=new int[cnt];
		for(int i=0;i<x.length;i++) // or for(int i=0;i<cnt;i++)
		{
			x[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter the"+cnt+" Array Element:"));
		}

		System.out.println("Array Elements Are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.print("   "+x[i]);
		}
	}
}
