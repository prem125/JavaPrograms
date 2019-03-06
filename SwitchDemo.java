class  SwitchDemo
{
	public static void main(String[] args) 
	{
		char grade='A';
		switch(grade)
		{
			case'A': System.out.println("First Grade");
			break;
			case 'B': System.out.println("Second Grade");
			break;
			case 'C': System.out.println("Third Grade");
			break;
			case 'F': System.out.println("Fail");
			break;
			default: System.out.println("Absent");
			break;
		}
	}
}
