class getRuntimeInfo 
{
	public static void main(String[] args) 
	{
		Runtime os = Runtime.getRuntime();
		
		//Print memory details
		System.out.println("Total Memory: "+os.totalMemory());
		System.out.println("free Memory: "+os.freeMemory());
		System.out.println("max Memory: "+os.maxMemory());

		//print available processer
		System.out.println("Available Processer : "+os.availableProcessors());
	}
}
