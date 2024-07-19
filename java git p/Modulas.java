import java.util.Scanner;
class Modulas
{
	public static void main(String[]args)
	{
		int rem=0,no=0,tot=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter 3 digit No: ");
		no=sc.nextInt();

		System.out.println("NO is :- "+no);
   
		rem=no%10;
		tot=tot+rem;
		no=no/10;

		rem=no%10;
		tot=tot+rem;
		no=no/10;

		rem=no%10;
		tot=tot+rem;
		no=no/10;
		
		System.out.println("No="+no+"\t Tot="+tot);
		
	}
}