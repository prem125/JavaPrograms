import java.util.Scanner;

class AreaCircle 
{
	public static void main(String[] args) 
	{
		double radius;
		 Scanner sc=new Scanner(System.in);
		 // input radius of circle
		System.out.println("Enter the radius of circle : ");
		radius=sc.nextDouble();
		// Circle A	rea is pie * radius square
		double area=3.14*radius*radius;
		System.out.println("Area of Circle = "+area);
	}
}
