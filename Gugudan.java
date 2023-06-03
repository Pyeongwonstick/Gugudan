import java.util.Scanner; // JDK에서 제공하는 class 사용

public class Gugudan {
	public static void main(String[] args) { 
	System.out.println("구구단 중 출력할 단은? : "); 
	System.out.println(System.in);
	Scanner scanner = new Scanner(System.in); // Scanner = 데이터 타입, scanner = 변수 
	int number = scanner.nextInt();
	
	System.out.println(number * 1);
	System.out.println(number * 2);
	System.out.println(number * 3);
	System.out.println(number * 4);
	System.out.println(number * 5);
	System.out.println(number * 6);
	System.out.println(number * 7);
	System.out.println(number * 8);
	System.out.println(number * 9);
	}

}
// 단순하게 구구단 구현
