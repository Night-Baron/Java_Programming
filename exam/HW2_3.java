import java.util.Scanner;
public class HW2_3{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num1, num2, sum;

		System.out.print("천번째 양의 정수: ");
		num1 = s.nextInt();
		System.out.print("두번째 양의 정수: ");
		num2 = s.nextInt();
		sum = num1 + num2;

		System.out.printf("%-10s|%-10s|%-10s|%-11s|\n", "number", "decimal", "octal", "hexadecimal");
		System.out.printf("%-10s|%+10d|%-#10o|%#11x|\n", "number 1", num1, num1, num1);
		System.out.printf("%-10s|%+10d|%-#10o|%#11x|\n", "number 2", num2, num2, num2);
		System.out.printf("%-10s|%-+10d|%-#10o|%-#11x|\n", "sum", sum, sum, sum);
	}
}
