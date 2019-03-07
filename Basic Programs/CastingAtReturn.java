class CastingAtReturn 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		int res=disp();
		System.out.println("Res is "+res);
		double res1=demo();
		System.out.println("Res1 is "+res1);
	}
	public static int disp()
	{
		System.out.println("Disp method running...");
		return (int)5.5;
}
public static double demo()
	{
	System.out.println("Demo method running...");
	return 60;
	}
}
