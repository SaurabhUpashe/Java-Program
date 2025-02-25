import java.io.*;
class UsingIf1
{
	public static void main(String []args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double p1,p2,p3,dis=0.0;
		
		System.out.println("Enter the First Item Price: ");
		p1=Double.parseDouble(br.readLine());

		System.out.println("Enter the Second Item Price: ");
		p2=Double.parseDouble(br.readLine());

		System.out.println("Enter the Third Item Price: ");
		p3=Double.parseDouble(br.readLine());

		Double tot=p1+p2+p3;

		if(tot>500)
		{
			dis=tot*0.05;
		}
		
		System.out.println("Total Bill: "+tot);
		System.out.println("Total Discount: "+dis);

		

		
		
	}
}
	