class Pyramid6 
{
	public static void main(String[] args) 
	{
		int n=9;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				if(j==5||(i+j)==6||(j-i)==4||(i-j)==4||(i+j)==14)
				System.out.print("*");
					else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}