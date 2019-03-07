class Multiply 
{
	public static void main(String[] args) 
	{
		System.out.println("Main started");
		multiple(2,3);
		multiple(54,0);
		System.out.println("Main ended");
	}
	public static void multiple(int n1, int n2)
	{
		int res=n1*n2;
		System.out.println(n1+"*"+n2+"="+res);
}
}