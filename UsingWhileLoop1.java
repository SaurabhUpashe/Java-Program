// Enter the number and find its factorial


import java.util.Scanner;
class UsingWhileLoop1
{
	public static void main(String []args)
	{
		int no,fact=1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Any No: ");
		no=sc.nextInt();
	
		int i=1;
		while(i<=no)
		{
			fact=fact*i;
			i++;
		}

		System.out.println("Factorial is: "+fact);
		
	}
}