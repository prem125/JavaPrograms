class Program24 
{
	public static void main(String[] args) 
	{
		for (int i=2;i<=8 ;i=i+2 )
		{
			for( int j=2; j<=i;j=j+2)
			{
				if(i>=j)
					System.out.print(i);
			}
			System.out.println();
		}
	}
}
