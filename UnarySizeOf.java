class UnarySizeOf
{
	public static void main(String []args)
	{
		int x=1536;
		float ft=25.6f;
		double db=256.69845;

		System.out.println("int type: "+Integer.BYTES);
		System.out.println("int type x: "+x);
	
		System.out.println("float type: "+Float.BYTES);
		System.out.println("float type ft: "+ft);

		System.out.println("double type: "+Double.BYTES);
		System.out.println("double type : "+db);

	}
	
}