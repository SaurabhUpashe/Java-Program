import java.util.Scanner;
class TitleCase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your String ");
		String str=sc.nextLine();

		char ch[]=str.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			if(i==0 || (ch[i]!=' ' && ch[i-1]==' '))
			{ 
				if(ch[i]>='a' && ch[i]<='z')
				{
					ch[i]=(char)(ch[i]-32);
				}
			}
			else
			{
				if(ch[i]>='A' && ch[i]<='Z')
				{
					ch[i]=(char)(ch[i]+32);
				}
			}
		}
		str=new String(ch);
		System.out.println(""+str);

	}
}
