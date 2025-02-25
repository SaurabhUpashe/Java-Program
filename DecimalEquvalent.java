import java.util.Scanner;
class DecimalEquvalent 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Number");
		int no=sc.nextInt();
 
 		int decimal=1;
		while(no!=0)
		{
			int rem=no%10;
			if(rem==1)
			{
				//decimal+=1;
				decimal=decimal*2+rem;
			}
			else
			{
				decimal=decimal*2;
			}
			no=no/10;
		}
		System.out.println(" "+decimal);
		//int decimal=Integer.parseInt(no,2);
		//System.out.println(" "+decimal);
	}
}
