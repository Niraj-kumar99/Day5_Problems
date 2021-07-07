import java.util.Scanner;

public class flipCoin {
	public static void main(String[] args) {
		
		double n ;  // No of times to flip ..
		int i;
		double head = 0;
		double tail = 0;
		double HProb;
		double TProb;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of times want to flip coin : ");
		n = sc.nextInt();
		sc.close();
		

		
		// Logic to Flip Coin to get Head or Tail ...
			
		for (i = 0 ; i <n ; i++)
		{
			double x = Math.random();
			
			if (x < 0.5)
			{
				tail++;
			}
			else
			{
				head++;
			}
			
		}

		System.out.println("head : "+head);
		System.out.println("tail : "+tail);
		
		HProb = (head*100)/n;
		TProb = (tail*100)/n;
		
		System.out.println("Probability of Head : "+HProb);
		System.out.println("Probability if Tail : "+TProb);
	}
}
