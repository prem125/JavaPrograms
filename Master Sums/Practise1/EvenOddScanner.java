import java.util.Scanner;

class EvenOddScanner 
{
	public static void main(String[] args) 
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		num=sc.nextInt();
		if(num%2==0)
		{
		System.out.println("The Given Number Is Even.");
		}
		else
		{
			System.out.print("The Number Is Odd");
	}
	}
}
