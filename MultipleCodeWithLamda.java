//Without return type
/*interface PrimeCal
{
	void isPrime(int no);
}
class MultipleCodeWithLamda 
{
	public static void main(String[] args) 
	{
		PrimeCal ob = (no) ->{
			int d=2,flg=0;
			while(d<=no/2)
			{
				if(no%d==0)
				{
					flg=1;
					break;
				}
				d++;
			}
			if(flg==0)
			{
				System.out.println("Number is Prime: ");
			}
			else
			{
				System.out.println("Number is not Prime: ");
			}
		};

		ob.isPrime(12);
	}
}*/

//With Return Type 
interface PrimeCal
{
	boolean isPrime(int no);
}
class MultipleCodeWithLamda 
{
	public static void main(String[] args) 
	{
		PrimeCal ob = (no) ->{
			int d=2;
			boolean flg=true;
			while(d<=no/2)
			{
				if(no%d==0)
				{
					flg=false;
					break;
				}
				d++;
			}
			return flg;
		};

		if(ob.isPrime(12))
		{
			System.out.println("Number is Prime: ");
		}
		else
		{
			System.out.println("Number is not Prime: ");
		}
	}
}