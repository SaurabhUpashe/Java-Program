import javax.swing.JOptionPane.showInputDialog;
class AnotherInputClass
{
	public static void main(String[]args) throws Exception
	{
		
		int x=0;
		float y=0.0f;
		double z=0.0;

		String str=JOptionPane.showInputDialog("Enter the String: ");	
		x=Integer.parseInt(JOptionPane.showInputDialog("Enter The interger Value: "));
		y=Float.parseFloat(JOptionPane.showInputDialog("Enter The Float Value: "));
		z=Double.parseDouble(JOptionPane.showInputDialog("Enter the Double Value"));

		System.out.println("String is: "+str);
		System.out.println("X="+x+"\t y="+y+"\t Z="+z);
		
	}
}