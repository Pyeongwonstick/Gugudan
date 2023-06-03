import java.util.Scanner;
public class GuGudan5{
	public static void main(String[] args) {
		int[] result = new int[9];
		System.out.println("출력할 구구단은?: ");
		System.out.println(System.in);
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		{
			
		}
		for(int i = 0; i < result.length; i++) {
			result[i] =  number * (1 + i);
		}
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		}
	}
