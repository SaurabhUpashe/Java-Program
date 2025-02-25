import java.util.Scanner;
class Number
{
	private int no;
	public void setNumber(int n)
	{
		no=n;
	}
	public void primeNO()
	{
		int flg=0;
		int tmpno=no;
		for(int i=2;i<=tmpno/2;i++)
		{
			if(tmpno%2==0)
			{
				flg=1;
				break;
			}
		}
		if(flg==0)
		{
			System.out.println("Number is Prime Number: ");
		}
		else
		{
			System.out.println("Number is not Prime Number: ");
		}
	}
	public int ReverseNO()
	{
		int tmp=no;
		int rev=0;
		while(tmp!=0)
		{
			rev=rev*10+(tmp%10);
			tmp=tmp/10;
		}
		return rev;
	}
	public char isPlaindome()
	{
		if(no==ReverseNO())
		{
			return 'y';
		}
		else
		{
			return 'n';
		}
	}
	public void isEvenOrOdd()
	{
		if(no%2==0)
		{
			System.out.println("Number is Even: ");
		}
		else
		{
			System.out.println("Number is Odd: ");
		}
	}
	public void getNumber()
	{
		System.out.println("Number is: "+no);
	}
}
class  MainNumberClass
{
	public static void main(String[] args) 
	{

		Number n1 = new Number();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any NO: ");
		int no=sc.nextInt();
		n1.setNumber(no);
		n1.getNumber();

		n1.primeNO();

		System.out.println("Reverse no is: "+n1.ReverseNO());

		if(n1.isPlaindome()=='y')
		{
			System.out.println("Number is Palindrome: ");
		}
		else
		{
			System.out.println("Number is not Palindrome: ");
		}

		n1.isEvenOrOdd();
	}
}
