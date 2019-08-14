import java.util.Scanner;

public class loop1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int age;


		/* (version 1) while문
		
		System.out.print("나이: ");
		age = s.nextInt();
		
		while(age < 0 || age >= 200){
			System.out.println("[입력오류]나이는 0세 이상 200미만의 값만 유효합니다.");
			System.out.print("나이: ");
			age = s.nextInt();
		}*/

		/* (version 2) do while문
		do{
			System.out.print("나이: ");
			age = s.nextInt();
			if(age < 0 || age>= 200)
				System.out.println("[입력오류] 나이는 0세 이상 200미만의 값만 유효합니다.");
		}while(age < 0 || age >= 200);
		*/

		while(true){
			System.out.print("나이: ");
			age = s.nextInt();

			if(age >=0 && age < 200) break;

			System.out.println("[입력오류] 나이는 0세 이상 200미만의 값만 유효합니다.");
		}


		System.out.println("당신의 나이는 " + age + "세 입니다.");
	}
}
