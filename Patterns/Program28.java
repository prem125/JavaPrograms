class Program28 
{
	public static void main(String[] args) 
	{
		int first=0, second=1, sum=0;
		for (int i=1; i<=4 ;i++ )
		{
			for (int j=1; j<=i ; j++ )
			{
				sum=first+second;
				System.out.print(first+" ");
				first=second;
				second=sum;
			}
		System.out.println();
	}
}
}