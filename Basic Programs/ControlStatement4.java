class  CallingStatement4
{
	public static void main(String[] args) 
	{
		System.out.println("Main Started");
		int res=add();
		System.out.println(res);
		int op=add();
		System.out.println(op);
	    res=op+res+add();
		System.out.println(res);
		System.out.println("Main Ended");
	}
	public static int add()
	{
		System.out.println("adding");
		return 20;
}
}