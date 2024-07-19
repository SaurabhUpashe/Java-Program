import java.io.BufferedReader;
import java.io.InputStreamReader;
class IoNew
{
	public static void main(String []args) throws Exception
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader os=new BufferedReader(isr);
		System.out.println("Enter The Data: ");
		String str=os.readLine();
		System.out.println("Data is:"+str);
	}
}