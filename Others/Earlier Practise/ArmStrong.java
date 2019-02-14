class Armstrong
{
	public static void main(String[] args)
	{
		int res=0, num=153, temp=num;
		while(num>0)
		{
			int rem=num%10;
			res=res+rem*rem*rem;
			num=num/10;
}
		if(temp==res)
			System.out.println("ArmStrong");
		else
			System.out.println("Not ArmStrong");
	}
}