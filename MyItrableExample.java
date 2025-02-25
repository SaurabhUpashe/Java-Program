import java.util.Iterator;
class MyItrator implements Iterable<String>
{
	private String []data;
	public MyItrator(String []data)
	{
		this.data=data;
	}
	@Override
	public Iterator<String> iterator()
	{
		return new Iterator<String>(){
			private int index = 0;
			public boolean hasNext()
			{
				return index < data.length;
			}
			public String next()
			{
				if(!hasNext())
				{
					throw new java.util.NoSuchElementException();
				}
				return data [index++];
			}
		};
	}
}
class  MyItrableExample
{
	public static void main(String[] args) 
	{

		//Your write like this no problem
		//String []str = new String[]{"Hello","World","Iterable","Archer","infotech","Pune"};
		//MyItrator ob = new MyItrator(str);
		MyItrator ob = new MyItrator( new String []{"Hello","World","Iterable","Archer","infotech","Pune"});
		

		//Iterate over the element using a foreach loop
		for(String value : ob)
		{
			System.out.println(value);
		}
	}
}
