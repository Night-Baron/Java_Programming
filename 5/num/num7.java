import java.util.Scanner;
public class num7{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num1, num2, max, min, result;

		System.out.print("정수 1:");
		num1 = s.nextInt();
		System.out.print("정수 2:");
		num2 = s.nextInt();

		if(num1>= num2){
			max = num1;
			min = num2;
		}else{
			max = num2;
			min = num1;
		}

		while(min != 0){
			result = max % min;
			max = min;
			min = result;
		}
		System.out.printf("두 정수의 최대 공약수는 %d입니다.\n", max);
	}
}
