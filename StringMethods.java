class StringMethods 
{
	public static void main(String[] args) 
	{
		String str1="Hello",str2="Hello",str3="good day";
		//Operator Overloading not present in java expilicity, but '+' binary Operator
		//are present in java implicity used to joind two or more string(concantanation)
		System.out.println("I said "+str1+" saurabh then saurabh said "+str2+" sayali "+str3);

		//-----------------------------------------
		boolean b = str1.equals(str2);
		System.out.println("str1 euqals to str2: "+b);

		b=str2.equals(str3);
		System.out.println("str2 euqals to str3: "+b);

		//When two same string literals(eg.Hello) are used to creat string object
		//then is will creat a shallow copy means two string pointing to same location 
		//if String literlas exactly same(eg. Hello and Hello)

		//----------------------------------------
		int len = "Good day To all".length();//we directly call like this cause String is an object
		System.out.println("Length of String(): "+len);//15

		String str = "";
		System.out.println("Length of Empty String(): "+str.length());//0


		//Using charAt()
		String s = "Hello Evry one";
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		//---------------------------------------
		String s1 = new String("");
		System.out.println("S1 is: "+s1);//Not print Anything

		String s2 = new String("Hello Sauraya");
		System.out.println("S2 is: "+s2.toString());//Print:S2 is: Hello Sauraya

		//----------------------------------------
		//here give the charater of unicode or ascii 
		byte [] bvalue ={65,66,67,69,71,72,74,75};
		String s3 = new String(bvalue);
		System.out.println("S3 is: "+s3);//S3 is: ABCEGHJK

		//---------------------------------------

		String s4 = new String(bvalue,2,5);//(<Array_name>,<starting_index>,<how_many_char>)
		System.out.println("S4 is: "+s4);//S4 is: CEGHJ

		//------------------------------------------
		 //We can not take charater array from user but its possible to direct initilization


		char []ch={'h','o','w',' ','a','r','e',' ','y','o','u'};
		String s5 = new String(ch);
		System.out.println("S5 is: "+s5);//S5 is: how are you

		//------------------------------------------

		String s6 = new String(s2);
		System.out.println("S6 is: "+s2);//S6 is: Hello Sauraya

	}
}
