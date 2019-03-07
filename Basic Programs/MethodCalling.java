class MethodCalling
{
	public static void m1()
	{
		System.out.println("m1 method");
		m2();
	}
	public static void main(String[] args) 
	{
	System.out.println("Main Method Started");
	m1();
	System.out.println("Main Method Ended");
	}
	public static void m2()
		{
		System.out.println("m2 method");
		}
	}

