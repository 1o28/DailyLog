interface A
{
	void Adisplay();
	void Ashow();
}
interface B
{
	void Bdisplay();
	void Bshow();
}
class AB implements A,B
{
	public void Adisplay()
	{
		System.out.println("A Display");	
	}
	public void Ashow()
	{
		System.out.println("A Show");
	}		
	public void Bdisplay()
	{
		System.out.println("B Display");	
	}
	public void Bshow()
	{
		System.out.println("B Show");
	}		
}
class InterfaceAB
{
	public static void main(String args[])
	{
		AB obj = new AB();
		obj.Adisplay();
		obj.Ashow();
		obj.Bdisplay();
		obj.Bshow();
	}
}