class NumberPyramid 
{
	public static void main(String[] args) 
	{
		int n=3, sp=2, st=1;
		for (int i=1; i<=n ;i++ )
		{
			for (int j=1; j<=sp ;j++ )
			{
				System.out.print(" ");
			}
			for (int k=1;k<=st ;k++ )
			{
				System.out.print(k);
		}
		System.out.println();
		sp--;
		st=st+2;
	}
}
}