import java.util.Scanner;

class   
{
	public static void main(String[] args) 
	{
		int pck_money;
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter Pocket Money: ");
		pck_money=sc.nextInt();

		int per_ticket;
		Scanner sc1 =  new Scanner(System.in);
		System.out.print("Enter Rate Per Number Of Ticket: ");
		per_ticket=sc1.nextInt();

		int num_tickets;
		Scanner sc2 =  new Scanner(System.in);
		System.out.print("Enter Number of Tickets: ");
		num_tickets=sc2.nextInt();

		int sum = num_tickets*per_ticket;
		System.out.println("Total Price Of Tickets = "+sum);

		if(pck_money>=sum)
		{
			System.out.println("Book the tickets.");
		}
		else
		{
			System.out.println("Dont book the Tickest.");
		}
	}
}
