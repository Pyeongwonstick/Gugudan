import java.util.Scanner; // JDK 안에 있는 Scanner class 사용.
public class Gugudan4{
public static void main(String[] args)

	{
		System.out.println("출력할 구구단은 ? : ");
		System.out.println(System.in);
		Scanner scanner = new Scanner(System.in);
		int  number = scanner.nextInt();
	
		if(number <2) {
			System.out.println("다시 입력 바랍니다.");
		}else if (number > 9)
		{
			System.out.println("다시 입력 바랍니다.");
		}else
		{
			System.out.println("출력할 구구단: " + number);
			for(int i = 1; i < 10; i++) {
				System.out.println(number * i);
			}
		}
	}
}