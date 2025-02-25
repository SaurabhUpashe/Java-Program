import java.util.Arrays;
class StringMethod 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello Evry one good day";

		String s2 = s1.substring(3);
		System.out.println("S2 is: "+s2);

		String s3 = s1.substring(6,13);
		System.out.println("S3 is: "+s3);

		String s4 = s1.concat(" All The best");
		System.out.println("S4 is: "+s4);

		System.out.println("All the best".contains("e"));//true;
		System.out.println(s1.contains("ood d"));

		System.out.println("----------------------------------------------");
		System.out.println("All the best".startsWith("e"));
		System.out.println("All the best".startsWith("A"));
		System.out.println("All the best".startsWith("All"));

		System.out.println(s1.endsWith("l"));
		System.out.println(s1.endsWith("all"));
		System.out.println(s1.endsWith("to"));

		
		System.out.println("----------------------------------------------");
		System.out.println(s1.indexOf("o"));
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s1.indexOf("ll"));
		System.out.println(s1.lastIndexOf("ll"));

		System.out.println("----------------------------------------------");
		String s5=s1.replace('o','#');
		System.out.println("s5: "+s5);
		s5=s1.replace("ll","LL");
		System.out.println("s5: "+s5);
		
		System.out.println("----------------------------------------------");
		String s6=s1.toUpperCase();
		System.out.println("s6: "+s6);
		System.out.println("How ARE yoU".toLowerCase());
		String s7="      java programming      ";
		System.out.println("Length of String: "+s7.length());
		s7=s7.trim();		
		System.out.println("Length of String: "+s7.length());

		System.out.println("----------------------------------------------");
		String s8="good";
		String s9="good";
		String s10="day";
		System.out.println("s8 equals s9: "+s8.equals(s9));
		System.out.println("s8 equals s10: "+s8.equals(s10));
		System.out.println("s8 Compare to s9: "+s8.compareTo(s9));
		System.out.println("s8 Compare to s10: "+s8.compareTo(s10));

		System.out.println("----------------------------------------------");
		byte []b=s1.getBytes();
		System.out.println("bytes of s1: "+Arrays.toString(b));

	}
}
