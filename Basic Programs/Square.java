class Square 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started");
		square(5);
		square(100);
		square(13);
		System.out.println("Main ended");
	}
	public static void square(int num)
	{
		int res=num*num;
		System.out.println("Square of "+num+" is "+res);
	}
}
