import java.util.Scanner;

public class HW3_1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		
		double num1, num2, output;
		String type;

		System.out.printf("식을 입력하세요(ex. 7 + 4):" );
		num1 = s.nextDouble();
		type = s.next();
		num2 = s.nextDouble();
		

		switch(type){
			case "+":
				output = num1 + num2;
				if (output - (int)output == 0)
					System.out.printf("%d\n", (int)output);
				else
					System.out.printf("%.2f\n", output);
				break;
			case "-":
				output = num1 - num2;
				if (output - (int)output == 0)
					System.out.printf("%d\n", (int)output);
				else
					System.out.printf("%.2f\n", output);
				break;
			case "*":
				output = num1 * num2;
				if (output - (int)output == 0)
					System.out.printf("%d\n", (int)output);
				else
					System.out.printf("%.2f\n", output);
				break;
			case "%":
				if(num2 == 0){
					System.out.println("0으로 나눈 나머지를 구할 수 없습니다.");
					return;
				}
				output = num1 % num2;
				if (output - (int)output == 0)
					System.out.printf("%d\n", (int)output);
				else
					System.out.printf("%.2f\n", num1 % num2);
				break;
			case "/":
				if(num2 == 0){
					System.out.println("0으로 나눈 몫을 구할 수 없습니다.");
					return;
				}
				output = num1 / num2;
				if (output - (int)output == 0)
					System.out.printf("%d\n", (int)output);
				else
					System.out.printf("%.2f\n", num1 / num2);
				break;

			default:
				System.out.println("잘못된 연산자를 곱하셨습니다.");
		}
	}
}
