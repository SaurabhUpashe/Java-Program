import javax.swing.JOptionPane;
class InputUsingShowDialog
{
	public static void main(String []args)
	{
		int x;
		float ft;
		double db;

		x=Integer.parseInt(JOptionPane.showInputDialog("Enter the Int Value: "));
		ft=Float.parseFloat(JOptionPane.showInputDialog("Enter the Float Value: "));
		db=Double.parseDouble(JOptionPane.showInputDialog("Enter the Double Value: "));

		System.out.println("X: "+x+"\t ft="+ft+"\t db="+db);
	}
}