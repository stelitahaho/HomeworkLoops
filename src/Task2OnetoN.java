import java.util.Scanner;

public class Task2OnetoN {

	public static void main(String[] args) {
		// �������� ��������, ����� ��������� �� ��������� ������� �� 1 �� N,
				 //����� �� �� ����� �� 3 � 7. ������� N �� ������� �� ���������.
				  
				  
				  System.out.println("Insert Num:"); 
				  Scanner sc1 = new  Scanner(System.in); 
				  int num = sc1.nextInt();
				  for (int i = 1; i <= num; i++) { if (i % 3 == 0 || i % 7 == 0) {
				  
				  } else { System.out.println(i); }

		}
	}
	
}
