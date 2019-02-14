class CallingStatement5 
{
	public static void main(String[] args) 
	{
		System.out.println("Main Started");
		int op=add();
		System.out.println(op);
		System.out.println("Main Ended");
	}
	public static int add()
	{
		System.out.println("Adding");
		int n1=100, n2=200;
		int res=n1+n2;
		return res;
	}
}
