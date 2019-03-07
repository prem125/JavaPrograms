import java.util.Scanner;

class Palindrome1
{
	public static void main(String[] args) 
	{
		int num, rev=0, temp=num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		while(num>0)
		{
			int digit = num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if (temp==rev)
		{
			System.out.println("Number is Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}
}
