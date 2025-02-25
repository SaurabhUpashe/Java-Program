import java.io.IOException;
class MyMath
{
	private int x;
	private int y;
	public void input() {
		x=6;
		y=0;
	}
	public void div() throws Exception {
	    int z=0;
		//z=x/y;
		try{ z=x/y; }catch(Exception e){System.out.print("\n exception in MyMath: "+e);}
		System.out.print("\n Ans: "+z);
	}
} 

class Main1
{
	public static void main(String []args)
	{
		MyMath ob = new MyMath();
		ob.input();
		
		// ob.div();
		 
		try{ ob.div(); }catch(Exception e){System.out.print("\n exception in Main: "+e);}
	}
}
