class NumberOfDigits 
{
	public static void main(String[] args) 
	{
		int count=0, num=2496;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of digits = "+count);
	}
}
