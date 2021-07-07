import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		
		int a ,b ,c ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no. : ");
		a = sc.nextInt();
		System.out.println("Enter 2nd no. : ");
		b = sc.nextInt();
		System.out.println("Enter 3rd no. : ");
		c = sc.nextInt();
		sc.close();
		
		if ((a > b) & (a > c))
		{
			System.out.println("The greatest no is : "+a);
		}
		else if ((b > a) & (b > c))
		{
			System.out.println("The greatest no is : "+b);
		}
		else
			System.out.println("The greatest no is : "+c);
	}
}
