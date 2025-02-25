 // WAP TO DISPLAY THE the list of prime numbers from 10 to 100

class DoWhileLoop2
{
	public static void main(String []args)
	{
		
		for(int i=0;i<100;i++)
		{
			int no=i;
			int d=2;
			int flg=0;
			do
			{
				if(no%d==0)
				{
					flg=1;
					break;
				}
				d++;
			}while(d<=no/2);
			if(flg==0)
			{
				System.out.print("\t "+i);
			}
			
		}


	}
}