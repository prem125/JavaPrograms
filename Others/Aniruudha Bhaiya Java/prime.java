import java.util.Scanner;
class PrimeTest
{
	public static void main(String args[])
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		boolean f=true;
		for(int k=1; k<=n;k++)
		{		
			for(int i=2;i<=n/2;i++)
			{
			
				if(n%i==0)
				{
					//System.out.println("Not a Prime number..");
					f=false;
					break;
				}
			}
			if(f==true)
			{
				System.out.println("Prime numbers are: "+k);
			}
		}	
	}
}