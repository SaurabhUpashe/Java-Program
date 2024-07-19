import javax.swing.JOptionPane;
class PaneOption
{
	public static void main(String[]args) throws Exception
	{
		int x=0;
		float y=0.0f;
		double z=0.0;

		String str=JOptionPane.showInputDialog("Enter TRhe String: ");
		x=Integer.parseInt(JOptionPane.showInputDialog("Enter the Integer Value: "));
		y=Float.parseFloat(JOptionPane.showInputDialog("Enter the Float Value: "));
		z=Double.parseDouble(JOptionPane.showInputDialog("Enter the Double value: ")); 

		System.out.println("String is: "+str);
		System.out.println("Numeric data x="+x+"\t y="+y+"\t z="+z);
	}
}