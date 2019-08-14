//사용자에게서 나이 입력받아 그래로 출력하기
import java.util.*;

class InputAge{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);

		int age;
		try{
			System.out.print("나이: ");
			age = s.nextInt();

			System.out.println("나이: "+ age);
		}catch(InputMismatchException ime){
			System.out.println("나이는 정수로만 입력해주세요.");
		}
		System.out.println("실행됨?");
	}
}
