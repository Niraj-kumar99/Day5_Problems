import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		no = sc.nextInt();
		sc.close();
		if (no%2 == 0)
		{
			System.out.println("EVEN NO");
		}
		else
		{
			System.out.println("ODD NO");
		}
	}

}
