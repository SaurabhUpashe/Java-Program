import java.util.Scanner;
class Take
{
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int x=0;
		float ft=0.0f;
		double db=0.0;

		System.out.println("Enter The String");
		String str=sc.nextLine();

		System.out.println("Enter The Integer: ");
		x=Integer.parseInt(sc.nextLine());

		System.out.println("Enter The Integer: ");
		ft=Float.parseFloat(sc.nextLine());

		System.out.println("Enter The Integer: ");
		db=Double.parseDouble(sc.nextLine());

		System.out.println("\n String is:"+str+"\n X="+x+"\n ft="+ft+"\n db="+db);
	}
}