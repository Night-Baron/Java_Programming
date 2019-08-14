import java.util.Scanner;
public class max{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		double num1, num2, max;
		String stringMax;
		System.out.println("실수1와  실수2를  입력하시오");
		num1 = s.nextDouble();
		num2 = s.nextDouble();
	
		max = (num1>num2) ? num1 : num2;
		stringMax = (num1 > num2) ? "최대는 앞의 수 입니다." : (num1 == num2) ? "두 수는 동일합니다." : "최대는 뒤의 수입니다." ;	

		System.out.println("최대값: "+ max);
		System.out.printf("입려간 두 수는 %.2f, %.2f이며, %s\n", num1, num2, stringMax);
	}
}
