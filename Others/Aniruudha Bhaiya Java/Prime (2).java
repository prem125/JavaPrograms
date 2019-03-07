import java.util.Scanner;
class PrimeCheck
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		boolean f=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not a prime");
				f=false;
				break;
			}	
		}
		if(f==true)
		{
			System.out.println("Number is prime number");
		}
	}
}