import java.util.Scanner;
class UsingIfElse1
{
	public static void main(String []args)
	{
		double i1,i2,i3,dis=0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First item Value: ");
		i1=sc.nextDouble();

		System.out.println("Enter second item Value: ");
		i2=sc.nextDouble();

		System.out.println("Enter Third item Value: ");
		i3=sc.nextDouble();

		double tot=i1+i2+i3;

		if(tot>500)
		{
			dis=tot*0.05;
		}
		else
		{
			dis=tot*0.07;
		}

		System.out.println("Total is: "+tot);

		System.out.println("Discount is: "+dis);
	}
}