import java.util.Scanner;
public class NDividedbyK {

	public static void main(String[] args) {
				Scanner input = new Scanner(System.in); 
				  System.out.println("Insert K"); 
				  int k = input.nextInt();
				  System.out.println("Insert N ");
				  int n = input.nextInt(); 
				  int fakN = 1; int fakK = 1;
				  
				  for (int z = 1; z <= k; z++)
				  
				  { fakN *= z;
				  
				  } for (int j = 1; j <= n; j++)
				  
				  { fakK *= j;
				  
				  }
				  
				  System.out.print("Factorial N!/K! e: ");
				  System.out.println(fakN/fakK);
				  input.close();	
		}
}