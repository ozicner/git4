
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");

	Scanner scanner = new Scanner(System.in);
	String inputString;
	
		
	do {
		System.out.print(">");
		inputString = scanner.nextLine();
		System.out.print( ! inputString.equals("q"));
		
		System.out.println();
		System.out.print("���α׷� ����");
	} while(false);
  }
}