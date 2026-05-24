import java.util.Scanner;

public class AreaOfCircle 
{
	public static void main(String[] args)
	{
		  Scanner scn = new Scanner(System.in);
			System.out.print("Enter the radius :");
			double radius = scn.nextDouble();
			final double pi = 3.14;
			double area = pi*(radius*radius);
			System.out.println("Area of circle = "+area);
	}

}
