class CallingStatement2 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		int res = add();
		System.out.println(res);
	}
	public static int add()
	{
		System.out.println("adding");
		return 20;
}
}