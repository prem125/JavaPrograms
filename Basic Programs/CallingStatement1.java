class CallingStatement1 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		add();
		add();
		add();
		add();
	}
	public static int add()
	{
		System.out.println("Adding");
		return 20;
}
}
