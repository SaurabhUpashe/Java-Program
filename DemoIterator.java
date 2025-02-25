import java.util.*;
class Demo implements Iterable<String>
{
	private String [] data;
	public Demo(String []data)
	{
		this.data = data;
	}
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
				return data[index++];
			}
		};
	}
}
class DemoIterator 
{
	public static void main(String[] args) 
	{
		Demo ob = new Demo(new String[]{"Hello", "World", "Iterable"});

		// Iterate over the elements using a for-each loop
		for(String val : ob)
		{
			System.out.println(val);
		}

		System.out.println("================");
		Iterator<String> itr = ob.iterator();
		while(itr.hasNext())
		{
			String str = itr.next();
			System.out.println(str);
		}
	}
}
