import java.util.Scanner;

public class Task2OnetoN {

	public static void main(String[] args) {
		// Напишете програма, която отпечатва на конзолата числата от 1 до N,
				 //които не се делят на 3 и 7. Числото N се въвежда от конзолата.
				  
				  
				  System.out.println("Insert Num:"); 
				  Scanner sc1 = new  Scanner(System.in); 
				  int num = sc1.nextInt();
				  for (int i = 1; i <= num; i++) { if (i % 3 == 0 || i % 7 == 0) {
				  
				  } else { System.out.println(i); }

		}
	}
	
}
