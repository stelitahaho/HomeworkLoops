import java.util.Scanner;

public class NFaktorialK2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input N: ");
		int N=input.nextInt();
		System.out.print("Input K: ");
		int K=input.nextInt();
		int i;
		int factorial=1;
		int factorial1=1;

		if(N<0 || K<0){
				System.out.println("K and N should be possitive numbers !");
			}
			else if(N>0 && K >0){
				
			for( i=1; i<=N ;i++){
				factorial=i*factorial;
			}
			for( i=1; i<=K ;i++){
				
				factorial1=i*factorial1;
			}
			}
			else if(N==0 || K==0){
				factorial=1;
				factorial1=1;
			}
			
		System.out.println((factorial*factorial1)/(N-K));
		input.close();		
		}
	
	}