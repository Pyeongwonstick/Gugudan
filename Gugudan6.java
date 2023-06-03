public class Gugudan6 { // 배열을 통한 변경 
	public static void main(String[] args)
	{
		//2단
		int[] result2 = new int[9];
		for(int i = 0; i < result2.length; i++)
		{
			result2[i] = 2 * (i+1); 
		}
		for(int i = 0; i < result2.length; i++) {
			System.out.println(result2[i]);
		}
		
		//3단	
		int[] result3 = new int[9];
		for(int i = 0; i < result3.length; i++)
		{
			result3[i] = 3 * (i+1);
		}
		for(int i = 0; i < result3.length; i++) {
			System.out.println(result3[i]);
		}
		//4단
		int[] result4 = new int[9];
		for(int i = 0; i < result4.length; i++)
		{
			result4[i] = 4 * (i+1);
		}
		for(int i = 0; i < result4.length; i++) {
			System.out.println(result4[i]);
		}
		
	}
}
