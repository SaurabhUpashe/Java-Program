import java.util.Scanner;
class IOExamples
{
	public static void main(String []args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		
		int x=0;
		float y=0.0f;
		double z=0.0; 
	
		
		String str=sc.nextLine("Enter the String");
		System.out.println("Enter the int data: ");
		x=sc.nextInt();
		System.out.println("Enter the float data: ");
		y=sc.nextFloat();
		System.out.println("Enter the double data: ");
		z=sc.nextDouble();

		System.out.println("String is: "+str);
		System.out.println("Numeric data x="+x+"\t y="+y+"\t z="+z);	
	}
}
