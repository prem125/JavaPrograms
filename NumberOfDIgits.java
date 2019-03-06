import java.util.Scanner;

class NumberOfDIgits 
{
	public static void main(String[] args) 
	{
		int count=0;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		while(num>0)
		{
		num=num/10;
		count++;
		}
		System.out.println("The Number of digits: "+count);
	}
}
