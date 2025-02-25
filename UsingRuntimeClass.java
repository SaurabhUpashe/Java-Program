class UsingRuntimeClass 
{
	public static void main(String[] args) 
	{
		try
		{
			Runtime os = Runtime.getRuntime();
			Process process = os.exec("notepad");
			process.waitFor();
			System.out.println("Notepad is Exited");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
