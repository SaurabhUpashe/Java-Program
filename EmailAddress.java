import java.util.Scanner;
class  EmailAddress
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Email");
		String str=sc.nextLine();

		char []ch = str.toCharArray();

		String com=".com";
		String net=".net";
		String org=".org";

		int cnt=0,symbolcnt=0,pos=0;
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]>='a' && ch[i]<='z') || ch[i]>=48 && ch[i]<=57)
			{
				cnt++;
			}
			else if(ch[i]=='@')
			{
				pos=i;
				symbolcnt++;
				cnt++;
			}
			else
			{	
				break;
			}
		}
		for(int i=pos+1,j=0;i<com.length();i++,j++)
		{
			if(com.charAt(j)==ch[i] || net.charAt(j)==ch[i] || org.charAt(j)==ch[i] )
			{
				cnt++;
			}
		}
		if(symbolcnt>1)
		{
			System.out.println("InValid");
		}
		if(cnt==ch.length-1)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("InValid");
		}
			

		
	}
}
