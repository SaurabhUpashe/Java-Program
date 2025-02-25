class InvalidLoginException extends Exception
{
	public InvalidLoginException(String msg)
	{
		super(msg);
	}
}
class Login
{
	private String username;
	private String password;
	public Login(String username, String password)throws InvalidLoginException
	{
		this.username = username;
		this.password = password;

		if(username==null || username.isEmpty())
		{
			throw new InvalidLoginException("Username can not be null or empty");
		}
		if(password==null || password.isEmpty())
		{
			throw new InvalidLoginException("Password can not be null or empty");
		}
	}
	public boolean isValid()
	{
		return true;
	}
}
class  LoginId
{
	public static void main(String[] args) 
	{
		try
		{
			Login log = new Login("", "Saurabh@123");
		}
		catch (Throwable el)
		{
			System.out.println(el.getMessage());
		}

		System.out.println("\n ============================ \n");

		try
		{
			Login log = new Login("SaurabhUapshe","");
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		try
		{
			Login log = new Login("SaurabhUpashe","Saurabh@123");
			if(log.isValid())
			{
				System.out.println("Successfully Login: ");
			}
			else
			{
				System.out.println("Login Failed: ");
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
}
