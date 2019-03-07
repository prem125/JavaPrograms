import java.util.Scanner;

class  Product
{
	public static void main(String[] args) 
	{
		int num, prod=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		while(num>0)
		{
		int digit=num%10;
		prod=prod*digit;
		num=num/10;
		}
		System.out.println("The product of the given number is  "+prod);
	}
}
