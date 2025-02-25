class FractionaWrapperExampe 
{
	public static void main(String[] args) 
	{
		int x=10, y=0;
		//System.out.println("x/y: "+(x/y)); 
		//Exception in thread "main" java.lang.ArithmeticException: / by zero

		float a=12.4f,b=0.0f;
		System.out.println("a/b: "+(a/b)); // a/b: Infinity

		float p=-132.4f,q=0.0f;
		System.out.println("p/q: "+(p/q)); // p/q: -Infinity

		System.out.println(0.0 / 0.0);	  //zero divided by zero //NaN
        System.out.println(Math.sqrt(5)); //take sqrt of negative number //NaN
        System.out.println(10.0 % 0);      //taking mod by zero //NaN

		float v1=56.34f, v2=67.23f,vmax=0.0f,vmin=0.0f;
		vmax=Float.max(v1,v2);
		vmin=Float.min(v1,v2);
		System.out.println("Min Value: "+vmin+"\t Max Value: "+vmax);
		System.out.println("v1+v2= "+Float.sum(v1,v2));

		v1=15F;
		System.out.println("Hex of v1: "+Float.toHexString(v1));		
	}
}
