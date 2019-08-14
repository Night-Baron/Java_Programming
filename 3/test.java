import java.util.Scanner;
public class test{
	public static void main(String args[]){
		Scanner ms = new Scanner(System.in);
		int a;
		int num1, num2;

		System.out.println("정수를 입력하시오");
		a = ms.nextInt();
		num1 = a >> 31;
		System.out.println((num1 == 0) ? "정수 a의 부호는 양수입니다." : "정수 a의 부호는 음수입니다.");
		System.out.println((num1 == 0) ? "정수 a의 절대값은 " + a + " 입니다." :"정수 a의 절대값은 " + ((~a)+1)  + " 입니다.");
		System.out.println("정수 a를 8로 나눈 몫은 " +(a >>3) + "입니다.");
		System.out.println("정수 a를 8로 나눈 나머지는 " + ((a << 29) >>> 29) +"입니다.");
		

		num2 = 0x80_00_00_00;
		System.out.println(((a & num2) == num2) ? "음수" : "양수");
		System.out.println("정수 a를 8로 나눈 나머지: " + (a & 0b111));
	}
}
