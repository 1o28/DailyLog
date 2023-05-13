class Single implements Runnable{
	public void run()
	{
		for (int i = 0;i<5;i++)
		System.out.println(i);
	}
}
class STR
{
	public static void main(String args[])
	{
		Single S = new Single();
		Thread T = new Thread(S);
		T.start();
	}	
}