class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int num=1234,rev=0;
		while(num>0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("Reversed Number is "+rev);
	}
}
