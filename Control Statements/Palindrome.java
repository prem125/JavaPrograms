class Palindrome 
{
	public static void main(String[] args) 
	{
		int num=121, rev=0,temp=num;
		while(num>0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(temp==rev)
		{
		System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}
}
