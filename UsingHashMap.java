import java.util.HashMap;
class UsingHashMap 
{
	public static void main(String[] args) 
	{
		HashMap <String,Integer> mp = new HashMap<>();

		mp.put("saurabh",23);
		mp.put("Sayali",25);
		mp.put("Aryan",16);
		mp.put("Shubham",14);

		System.out.println(mp);
		System.out.println(mp.get("Aryan"));//if done here spelling mistake 
		System.out.println(mp.get("sangita"));//null is printn coz this key not present in HashMap 
		System.out.println(mp);
	}
}
