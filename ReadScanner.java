import java.util.Scanner;
class ReadScanner
{
	public static void main(String []args)
	{
		int x;
		float y;
		double db;
		short s;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the int Value");
		x=sc.nextInt();
		System.out.println("int value is: "+x);
	
		System.out.println("Enter the Float Value");
		y=sc.nextFloat();
		System.out.println("Float value is: "+y);

		System.out.println("Enter the Double Value");
		db=sc.nextDouble();
		System.out.println("Double value is: "+db);

		System.out.println("Enter the short Value");
		s=sc.nextShort();
		System.out.println("Short value is: "+s);
	}
}