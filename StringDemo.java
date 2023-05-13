class StringDemo
{
	public static void main(String args[])
	{
		String str = " Hello ";
		System.out.println(str);
		
		//Eg: String is immutable i.e. we can not change the data inside a same location.	
		//str = str.concat("Welcome");
		//System.out.println(str);

		//Length of string	
		System.out.println(str.length());
		//eg : indexOf example
		System.out.println("Index of e is " + str.indexOf("e"));
		//eg: charAt example
		System.out.println("Character at index 1 is = " + str.charAt(1));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.compareTo("ello"));
		System.out.println(str.trim());
	}
}