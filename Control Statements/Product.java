class Product 
{
	public static void main(String[] args) 
	{
		int num=365, prod=1;
		while(num>0)
		{
			int rem=num%10;
			prod=prod*rem;
			num=num/10;
		}
		System.out.println("Product of the number is "+prod);
	}
}
