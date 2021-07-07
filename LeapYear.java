import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		year = sc.nextInt();
		sc.close();
		
		if((year%4 == 0) && (year%400 == 0))
		{
			System.out.println("LEAP YEAR");
		}
		else
			System.out.println("NOT A LEAP YEAR");
	}

}
