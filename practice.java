
import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");

	Scanner scanner = new Scanner(System.in);
	String inputString;
	
		
	do {
		System.out.print(">");
		inputString = scanner.nextLine();
		System.out.print( ! inputString.equals("q"));
		
		System.out.println();
		System.out.print("프로그램 종료");
	} while(false);
  }
}