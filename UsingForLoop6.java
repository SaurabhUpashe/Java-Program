// WAP To find max digit in a number

import javax.swing.JOptionPane;
class UsingForLoop6
{
	public static void main(String []args)
	{
		int no,max=0,rem=0;
		no=Integer.parseInt(JOptionPane.showInputDialog("Enter Any NO: "));

		for(;no!=0;)
		{
			rem=no%10;
			if(max<rem)
			{
				max=rem;
			}
			no=no/10;
		}
		System.out.println("Max Digit is: "+max);
	}
}