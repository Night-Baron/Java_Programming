import java.util.Scanner;
public class HW1_1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String name, tel;
		int age; Double weight;

		System.out.print("이름: ");
		name = s.next();
		System.out.print("나이: ");
		age = s.nextInt();
		System.out.print("몸무게: ");
		weight = s.nextDouble();
		System.out.print("전화번호: ");
		tel = s.next();

		System.out.printf("\"나의 이름은 \'%s\',", name);
		System.out.printf("\n\t나이는 %#x,", age);
		System.out.printf("\n\t\t몸무게는 %.3f,", weight);
		System.out.printf("\n\t\t\t전화번호는 %s입니다.\"\n", tel);
	}
}

