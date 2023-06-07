public class Gugudan7{ // method를 활용한 구구단
	public static int[] Calculate(int number) { // 구구단 식 배열에 저장 Calculate(int[] number) -> Calculate(int number)
		
		int[] result = new int[9]; // 구구단 배열에 저장
		for(int i = 0; i < result.length; i++) {
			result[i] = number * (1+i);
		}
		 return result; // result return; -> return result;
	}
	public static void Print(int[] result) { // 배열에 저장된 구구단 출력
		for(int i = 0; i < result.length; i++) {
		System.out.println(result[i]); // System.out.println(number * (1 + i)); -> System.out.println(result[i]);  
		}
	}
	
	public static void main(String[] args) { // main method 에서 다른 method 호출하기만해서 출력. 
		for(int i = 2; i < 10; i++ ) {
		
			int result[] = Calculate(i);
			Print(result);
		}
	}
}