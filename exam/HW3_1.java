import java.util.Scanner;
public class HW3_1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		double num1, num2, rslt=0;
		String cal;

		System.out.printf("식을 입력하세요(ex. 7 + 4): ");
		num1 = s.nextDouble();
		cal = s.next();
		num2 = s.nextDouble();

		switch(cal){
			case "+":
				rslt = num1 + num2;
				break;
			case "-":
				rslt = num1 - num2;
				break;
			case "*":
				rslt = num1 * num2;
				break;
			case "/":	
				if(num2 == 0){
					System.out.println("0으로 나눈 몫을 구할 수 없습니다.");
					return;
				}
				rslt = num1 / num2;
				break;
			case "%":
				if(num2 == 0){
					System.out.println("0으로 나눈 나머지를 구할 수 없습니다.");
					return;
				}
				rslt = num1 % num2;
				break;
		}
		if(rslt % 1 == 0)
			System.out.printf("%d\n", (int)rslt);
		else
			System.out.printf("%.2f\n", rslt);
	}
}	
