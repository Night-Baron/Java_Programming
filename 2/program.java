import java.util.Scanner;
public class program{
	public static void main(String[] args){
		String name;
		int age;
		double weight;
		String phonenum;

		Scanner myscan = new Scanner(System.in);

		System.out.print("이름: ");
		name  = myscan.nextLine();
		System.out.print("나이: ");
		age = myscan.nextInt();
		System.out.print("몸무게: ");
		weight = myscan.nextDouble();
		
		myscan.nextLine(); //EOF 받기

		System.out.print("전화번호: ");
		phonenum = myscan.nextLine();

		System.out.printf("나이 이름은 '%s'", name);
		System.out.printf("\t나이는 %#x," age);
		System.out.printf("\t\t몸무게는 %10.3f", weight);
		System.out.printf("\t\t\t전화번호는 '%s'입니다.", phonenum);
	}
}
