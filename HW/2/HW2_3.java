import java.util.Scanner;
public class HW2_3{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num1, num2, sum;

		System.out.print("첫번째 양의 정수:");
		num1 = s.nextInt();
		System.out.print("첫번째 양의 정수:");
		num2 = s.nextInt();
		sum = num1 + num2;

		System.out.format("%11s|%11s|%11s|%11s|\n", "number", "decimal", "octal", "hexadecimal");
		System.out.format("%11s|%+-11d|%#-11o|%#-11x|\n", "number 1", num1, num1, num1); 
		System.out.format("%11s|%+-11d|%#-11o|%#-11x|\n", "number 2", num2, num2, num2);
		System.out.format("%11s|%+-11d|%#-11o|%#-11x|\n", "sum", sum, sum, sum);
	}
}
