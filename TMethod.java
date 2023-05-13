class Th extends Thread
{
	public void main()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}
}
class TMethods
{
	public static void main(String args[])
	{
		Th t1 = new Th();
		t1.start();
	}
}