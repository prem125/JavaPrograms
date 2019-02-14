class HourglassStar 
{
	public static void main(String[] args) 
	{
		int n=8, sp=0,st=7;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1; j<=sp ;j++ )
			{
				System.out.print(" ");
			}
			for (int k=1;k<=st ;k++ )
			{
				System.out.print("*");
			}
		System.out.println();
		if(i<=5)
			{
			sp++;
			st=st-2;
		}
			{
			sp--;
			st=st+2;
			}
		}
	}
}
