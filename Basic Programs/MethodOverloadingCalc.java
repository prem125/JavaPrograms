class MethodOverloadingCalc
{
	public static void add()
	{
		int res=0+0;
		System.out.println("Non-arg add "+res);
	}
	public static void add(int num1, int num2)
	{
		int res = num1+num2;
		System.out.println("2-arg(int,int) add "+res);
	}
	public static void add(int num1, int num2, int num3)
	{
		int res=num1+num2+num3;
		System.out.println("3-arg add "+res);
	}
	public static void add(int num1, double num2)
	{
		double res=num1+num2;
		System.out.println("2-arg(int, double) add "+res);
	}
	public static void add(double num1, int num2)
	{
		double res=num1+num2;
		System.out.println("2-arg(double, int) add "+res);
	}
	public static void main(String[] args) 
	{
		add();
		add(2,3);
		add(1,2,3);
		add(3,4.4);
		add(3.3,4);
	}
}
