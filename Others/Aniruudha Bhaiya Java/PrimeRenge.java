import java.util.Scanner;
class PrimeRange
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number of range: ");
		int n=s.nextInt();
		for(int j=1;j<=n;j++)
		{
			boolean f=true;
			for(int i=2;i<=j/2;i++)
			{
				if(j%i==0)
				{
					f=false;
				}	
			}
			if(f==true)
			{
				System.out.print(" "+j);
			}
		}
	}
}