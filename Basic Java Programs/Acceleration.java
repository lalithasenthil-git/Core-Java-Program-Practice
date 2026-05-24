package basicjavaprograms;
import java.util.Scanner;
public class Acceleration
{
	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		System.out.print("Enter v1: ");
		double v1 = scn.nextDouble();
		System.out.print("Enter v2: ");
		double v2 = scn.nextDouble();
		System.out.print("Enter time");
		double time = scn.nextDouble();
		double avgAcc =( v1 + v2) / time;
		System.out.println("Acceleration Time = " +avgAcc);
		
	}
}
