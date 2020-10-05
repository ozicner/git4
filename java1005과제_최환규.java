import java.util.Scanner;

public class java1005과제_최환규 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("123 ");
			int n = scanner.nextInt();
			String reverseNum = " ";
			int sumNum = 0;

			
			if(n<1 || n>21*100*100*100*100) {
				return;
			}
			
			while(n!=0) {
				int num = n%10;
				if(num==0 && reverseNum.equals(" ")) {
					
				} else {
					reverseNum += String.valueOf(num);
				}
				sumNum += num;
				n/=10;
			}
			System.out.println(reverseNum+" "+sumNum);
		}
	}
}