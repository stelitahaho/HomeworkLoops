import java.util.Scanner;

public class Number1ToN {

	public static void main(String[] args) {
		/*
		 * Напишете програма, която отпечатва на конзолата числата от 1 до N.
		 * Числото N се въвежда от конзолата.
		 */
		Scanner sc = new Scanner(System.in);
		
		  System.out.println("Insert Num:");
		  
		  int N = sc.nextInt(); for (int i = 1; i <= N; i++) {
		  System.out.println(i);
		  
		  }
	}
}
