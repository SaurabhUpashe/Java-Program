class NegativeBalanceException extends Exception
{
	private String exmsg;
	public NegativeBalanceException(String msg)
	{
		super(msg);
		exmsg=msg;
	}
	public String toString()
	{
		return "Not Suffiecient Balance in Account: "+exmsg;
	}
}
class BankAccount
{
	private double balance;
	public BankAccount(double balance)
	{
		this.balance= balance;
	}
	public double getBalance()
	{
		return balance;
	}
	public void withdrawal(double amount)throws NegativeBalanceException
	{
		if(balance - amount < 0)
		{
			throw new NegativeBalanceException("Insuffcient fund to withdraw : "+amount+" rs");
		}
		else
		{
			balance -= amount;
		}

	}
}
class UserDefinedException1 
{
	public static void main(String[] args) 
	{
		BankAccount b = new BankAccount(100);
		try
		{
			b.withdrawal(236.23);
		}
		catch (NegativeBalanceException e)
		{
			System.out.println(e);
			System.out.println("============================");
			System.out.println(e.getMessage());
			System.out.println("============================");
			e.printStackTrace();
			
		}
		System.out.println("Current Balnce: "+b.getBalance());
	}
}
