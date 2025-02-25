class Demo
{
	public static void main(String []args) 
	{
		char []ch ={'s','a','u','r','a','b','h',' ','u','p','a','s','h','e','\0'};
		System.out.print(ch);

		System.out.println("charcter array: ");
		for(char tmp : ch)
		{
			System.out.print(" "+tmp);
		}

		System.out.println();
		System.out.println("Using normal loop:");
		for(int i=0;ch[i]!='\0';i++)
		{
			System.out.print("  "+ch[i]);	
		}

		String str = "We make IT easy";
		char [] ch1 =str.toCharArray();
		System.out.println(ch1);
	}
}
