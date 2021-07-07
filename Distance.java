import java.util.Scanner;


public class Distance {
	
	static void calculate_distance()
	{
		final double x1 = 0 , y1 = 0;
		double distance , x2  , y2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x : ");
		x2 = sc.nextDouble();
		System.out.println("Enter value of y : ");
		y2 = sc.nextDouble();
		sc.close();
		
		double x_res = (x2 - x1);
		double y_res = (y2 - y1);
		
		distance = Math.sqrt(Math.pow(x_res, 2) + Math.pow(y_res, 2));
		System.out.println("Distance from Origin is : "+distance);
		
	}
	public static void main(String[] args) {
		
		calculate_distance();
		
	}

}
