class Addition1
{
	static int res=0;
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		add(3,5);
		System.out.println(res);
	}
	public static void add(int num1 , int num2)
	{
		res=num1+num2;
}
}