class ShutdownUsingRuntime 
{
	public static void main(String[] args) 
	{
		Runtime run = Runtime.getRuntime();

		try
		{
			String os = System.getProperty("os.name").toLowerCase();
			if(os.contains("win"))
			{
				run.exec("shutdown -s -t 0");
			}
			else if(os.contains("mac"))
			{
				run.exec("shutdown -h now");
			}
			else if(os.contains("nix") || os.contains("nux") || os.contains("aix"))
			{
				run.exec("shutdown -h now");
			}
			else
			{
				 System.out.println("Unsupported operating system: " + os);
			}
		}
		catch (Exception e)
		{
		}
		System.out.println("Hello World!");
	}
}
