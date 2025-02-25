import java.io.InputStreamReader;
import java.io.BufferedReader;
class AssignOperater1
{
	public static void main(String []args)throws Exception
	{
		int x=0,y=0,z=0,tmp=0;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
 
		
		System.out.println("Enter the Any Three Value");
		x=Integer.parseInt(br.readLine());
		y=Integer.parseInt(br.readLine());
		z=Integer.parseInt(br.readLine());
		

		System.out.println("Before Exchange Value: ");
		System.out.println("x="+x+"\t y="+y+"\t z="+z);

		tmp=z;
		z=x;
		x=y;
		y=tmp;
		
		System.out.println("Exchange Value: ");
		System.out.println("x="+x+"\t y="+y+"\t z="+z);


	}
}