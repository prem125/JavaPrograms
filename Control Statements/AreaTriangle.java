import java.util.Scanner;

class  AreaTriangle
{
	public static void main(String[] args) 
	{
		int b, h;
		Scanner sc=new Scanner(System.in);
		//input base of triangle
		System.out.println("Enter the value of base: ");
		b=sc.nextInt();
		//input the value of Hypotenuse
		System.out.println("Enter the value of hypotenuse: ");
		h=sc.nextInt();
		//Area of Triangle is 1/2*base*hypotenuse
		double area=0.5*(b*h);
		System.out.println("Area of Triangle: "+area);
	}
}
