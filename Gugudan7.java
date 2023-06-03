public class Gugudan7{ // method를 활용한 구구단
	public static void main(String[] args) {
	int[] result = new int[9];
	
	for(int i = 0; i < result.length; i++) {
	result[i] = 2 * (1+i);	
	}
	for(int i = 0; i < result.length; i++) {
		System.out.println(result[i]);
	}
	}
}
		