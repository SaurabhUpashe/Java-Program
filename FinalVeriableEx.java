
class  FinalVeriableEx
{
	public final int con=10;
	public final int anothercon;
	public FinalVeriableEx(){
		anothercon=100;
	}
	public static void main(String[] args) 
	{
		FinalVeriableEx ob = new FinalVeriableEx();
		System.out.println(ob.con);
		System.out.println(ob.anothercon);

		//ob.con=500;//error: cannot assign a value to final variable con
		//ob.anothercon=600; //error: cannot assign a value to final variable anothercon

	}
}
