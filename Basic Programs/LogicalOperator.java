class LogicalOperator
{
	public static void main(String[] args) 
	{
		int i=10, j=10;
		boolean res=(i+j)<100 && (i-j)>50;
		System.out.println(res);
		res=((i-- + ++j)!=20) || ((i-- + ++j)==10);
		System.out.println(res);
	}
}
