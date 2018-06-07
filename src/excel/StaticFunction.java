package excel;

public class StaticFunction 
{
	public static void main(String[] args)
	{
		//Calling Static Fun
		/*add();
		add();*/
		/*String res=add1();
		System.out.println(res);*/
	//	System.out.println(add1());
		//Calling Non Static Fun
	}
	
		
	
//Satic Fun Without Return Any Value
	public static void add()
	{
		System.out.println("Add");
	}
	//Satic Fun Without Return Any Value
	
	public static String add1()
	{
		System.out.println("Add1");
		return "pass";
	}
//Non Static Fun Without Return Value
	public void sub()
	{
		System.out.println("Sub");
	}
	//Non Static Fun With Return Value
		public String sub1()
		{
			System.out.println("Sub");
			return "Pass";
		}
}
