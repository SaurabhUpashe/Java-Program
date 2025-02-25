import java.util.Scanner;
interface MyInterface
{
	void add(int a,int b);//complasary to write argument and data type
							//not complasary to write same argument name (a,b) of (x,y)
}
class LamdaExpressionWithArgument 
{
	public static void main(String[] args) 
	{
		MyInterface ob = (int x, int y) -> System.out.println("Addition is : "+(x+y));
		//Scanner sc= new Scanner(System.in);
		//int aa = sc.nextInt();
		//int bb = sc.nextInt();
		//ob.add(aa,bb); 
		ob.add(10,25); // you can write like this aslo(x,y) no need to data type 
		
	}
}
