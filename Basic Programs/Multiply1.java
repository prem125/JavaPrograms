class Multiply1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started");
		multiple(2,3);
		multiple(54,0);
		multiple1(3.3,5);
		multiple1((int)4.4,6);
		System.out.println("Main ended");
	}
	public static void multiple(int num1, int num2)
	{
		int res=num1*num2;
		System.out.println(num1+"*"+num2+"="+res);
	}
	public static void multiple1(double num1, int num2)
	{
		double res=num1*num2;
		System.out.println(num1+"*"+num2+"="+res);
}
}