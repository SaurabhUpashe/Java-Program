import javax.swing.JOptionPane;
class ForLoop
{
	public static void main(String[]args)
	{
		int tot=0,no=0;
		no=Integer.parseInt(JOptionPane.showInputDialog("Enter any No:"));

		for(;no!=0;no=no/10)
		{
			tot=tot+no%10;
		}
		
		System.out.println("Total is: "+tot);
	}
}