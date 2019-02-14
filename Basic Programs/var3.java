class Var3 
{
	public static void main(String[] args) 
	{
		final int id=123;
		System.out.println("id is "+id);
		int id = 345;
		System.out.println("id is "+id);//Error - can't to a final value int. 
	}
}
