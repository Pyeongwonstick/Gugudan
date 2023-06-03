import java.util.Scanner;
public class Gugudan2 {
public static void main(String[] args)
{
	System.out.println("출력할 구구단은 ? : ");
	System.out.println(System.in);
	Scanner scanner = new Scanner(System.in);
	int number = scanner.nextInt();
	System.out.println("number : " + number); 
	
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
// 입력한 구구단을 출력해주는 프로그램