import java.util.Scanner;
public class Gugudanfinal2{
	public static void main(String[] number) {
			int[] result = new int[9];
		 	System.out.println("출력할 구구단은?: ");
			System.out.println(System.in);
			Scanner scanner = new Scanner(System.in);
			String inputValue = scanner.nextLine();
			String[] splitedValue = inputValue.split(",");
			int first = Integer.parseInt(splitedValue[0]);
			int second = Integer.parseInt(splitedValue[1]);
			{
				
			}
			for (int i = 1; i <= second; i++) {
			      for (int j = 2; j <= first; j++) {
			        System.out.print(j + " * " + i + " = " + String.format("%2d", i * j));
			        System.out.print("    ");
			      }
			      System.out.println("");
			    }
			  }
			}


