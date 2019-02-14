class CastingAtReturn1
{
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		double res=(double) disp();
		System.out.println("Res is "+res);
		int res1=(int) demo();
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
