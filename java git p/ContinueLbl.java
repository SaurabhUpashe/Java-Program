class ContinueLbl
{
	public static void main(String[]args)
	{
		int i,j;
		outer:for(i=0;i<10;i++)
		{
			
			for(j=0;j<10;j++)
			{
				if(i>5)
				{
					System.out.println("saurabh");
					continue outer;
				}

				if(j>i)
				{
					System.out.println("9");
					continue;
				}
				
			}
		}

	}
}