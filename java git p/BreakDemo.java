class BreakLbl 
{
	public static void main(String[] args) 
	{
		int i,j;
		outer:for(i=0;i<10;i++)
		{
			System.out.println("s");
			for(j=0;j<10;j++)
			{
				if(j>i)
				{
					break outer;
				}
				if(j>i)
				{
					break;
				}
				System.out.println("u");
			}
		}
		System.out.println("SaurabhUpashe!");
	}
}
