class TestMain
{
	public static void main(String args[])
	{
		Sample s=new Sample();
		s.disp();
		//new Sample();		
	}
}
class Sample
{
	Sample()
	{
		System.out.println("Hello Constructor");
	}
	void disp()
	{
		System.out.println("Hello Method");
	}
}