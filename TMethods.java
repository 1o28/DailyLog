class Th extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		try{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
		}
			System.out.println(i);
		}
	}
}
class TMethods
{
	public static void main(String args[])
	{
		Th t1 = new Th();
		Th t2 = new Th();
		/*System.out.println("ID = "+t1.getId());
		System.out.println("Name of Thread = " +t1.getName());
		t1.setName("NewThread");
		System.out.println("After setting New name of Thread = " +t1.getName());
		System.out.println("Priority of Thread "+t1.getPriority());
		t1.setPriority(1);
		System.out.println("After setting New priority of Thread "+t1.getPriority());*/
		t1.start();
		try{
			t1.join();
		}
		catch(Exception e){
		}
		t2.start();
	}
}