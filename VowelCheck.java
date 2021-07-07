import java.util.Scanner;
public class VowelCheck {
	public static void main(String[] args) {
		
		char ch ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a charecter : ");
		ch = sc.next().toLowerCase().charAt(0);
		sc.close();
		if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println(ch +" is a VOWEL");
		}
		else
			System.out.println(ch +" is not A VOWEL");
	}

}
