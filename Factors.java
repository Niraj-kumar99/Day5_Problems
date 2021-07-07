import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // scanner to get user input
		System.out.print("Enter number: ");
		int num = scanner.nextInt();
		scanner.close();

		if (num < 1) {
			System.out.println("Number should be greater than 0");
		} else {
			System.out.print("The prime factors are: ");

			for (int i = 2; i * i <= num; i++) {
				
				if (((num % i) == 0)) {
					System.out.print(i + " ");
					
				}
			}
			System.out.println();
		}
	}


}
