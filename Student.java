class Student
{
	String name;
	int rno;
	Student()
	{
		name = "Vipul";
		rno = 21;	
	}
	Student(String str, int newrno)
	{
		name = str;
		rno = newrno;		
	}
	public static void main(String args[])
	{
		Student s1 = new Student();
		Student s2 = new Student("Yukti", 22);
		System.out.println(s1.name);
		System.out.println(s1.rno);
		System.out.println(s2.name);
		System.out.println(s2.rno);
	}
}