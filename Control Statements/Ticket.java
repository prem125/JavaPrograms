class Ticket 
{
	public static void main(String[] args) 
	{
		int pck_money=500;
		int no_tickets=5;
		int per_tck=100;
		if(pck_money>=(no_tickets*per_tck))
		{
			System.out.println("Book the ticket");
		}
		else
		{
			System.out.println("Low Pocket Money");
			}
}
}