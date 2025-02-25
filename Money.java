class BankAccount
{
	private int balance = 200;
	public synchronized void withdraw(int amount)
	{
		if(balance>=amount)
		{
			System.out.println(Thread.currentThread().getName()+" Processing with Withdrawal");
			try
			{
				Thread.sleep(3000);
			}
			catch (Exception e)
			{
			}
			balance = balance-amount;
			System.out.println(Thread.currentThread().getName()+" Completed Balance Remaining Balance: "+balance);
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" Insuffiesient Balance: ");
		}
	}
}
class  Money
{
	public static void main(String[] args) 
	{
		BankAccount sbi = new BankAccount();
		Runnable task = new Runnable(){
			public void run()
			{
				sbi.withdraw(75);
				//BankAccount.withdraw(75);
			}
		};
		Thread t1 = new Thread(task,"saurabh");
		t1.start();

		Thread t2 = new Thread(task,"sayali");
		t2.start();
	}
}
