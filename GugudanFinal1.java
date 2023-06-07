import java.util.Scanner; 
public class GugudanFinal1 {
public static int[] Calculate(int number) { // 구구단 배열에 저장
		int[] result = new int[number]; 
		for(int i = 0; i < result.length; i++) {
			result[i] = number * (1+i);
		}
		 return result;
	}
	public static void Print(int[] result) { // 구구단 프린트
		for(int i = 0; i < result.length; i++) {
		System.out.print(result[i] + " " ); 
		}
	}
	
	public static void main(String[] args) {
		 	
		System.out.println("출력할 구구단은?: ");
		System.out.println(System.in);
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		
		for(int i = 2; i <= number; i++) {
		System.out.println("  ");
		int result[] = Calculate(i);
		Print(result);
		}
}
}
