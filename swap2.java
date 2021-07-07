import java.util.Scanner;

public class swap2 {
	public static void main(String[] args) {
		
		int x , y , temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x : ");
		x = sc.nextInt();
		System.out.println("Enter value of y : ");
		y = sc.nextInt();
		sc.close();
		System.out.println("Before Swaping  ...\nValue of x ="+x +"\nValue of y = "+y);
		
		// Logic with temporary variable ....
		temp = x ;
		x = y ;
		y = temp ;
		
		System.out.println("\nAfter Swaping  ...\nValue of x ="+x +"\nValue of y = "+y);
	}

}