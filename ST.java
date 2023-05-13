class Single extends Thread
{
	public void run()
	{
		System.out.println("Thread Execution begins...");
	}
	/*Single()
	{
		System.out.println("Executing Constructor");
	}*/
}
class ST{
	public static void main(String []args)
	{
		Single s = new Single();
		s.start();
	}
}