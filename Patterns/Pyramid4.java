class Pyramid4 
{
	public static void main(String[] args) 
	{
		int n=7, sp=3, st=1;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=sp ;j++ )
			{
				System.out.print(" ");
			}
			for (int k=1;k<=st ;k++ )
			{
				System.out.print("*");
		}
		System.out.println();
		if(i<=n/2)
			{
			sp--;
			st=st+2;
			}
			else
			{
				sp++;
				st=st-2;
			}
	}
}
}