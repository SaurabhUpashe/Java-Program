//reverse the Array At the Same Location

import javax.swing.JOptionPane;
class ReverseArray
{
	public static void main(String []args)
	{
		int []arr = new int [10];
		
		for(int i=0;i<10;i++)
		{
			arr[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter "+arr.length+" Array Element: "));
			
		}
		
		System.out.println(" Orignal Array: ");
		for(int i=0;i<10;i++)
		{
			System.out.print("  "+arr[i]); 			
		}

		System.out.println("");
		System.out.println(" Reverse Array: ");
		for(int i=0;i<10;i++)
		{
			System.out.print("  "+arr[9-i]); 			
		}


	}
}