import java.util.Scanner;

public class InputAge{
	public static void main(String[] args){
		int Age;
		Scanner myScanner = new Scanner(System.in); //키보드에서 자료를 읽어오는 스캐너 생성
		//System.in : 표준입력장치 = 키보드
		System.out.print("나이: ");
		Age = myScanner.nextInt(); //스캐너에게 정수하나 입력받아달라고 요청
		System.out.println("당신의 십년 후 나이는 " + (Age+10) + "세 입니다.");
		System.out.printf("당신의 십년 후 나이는 %d세 입니다.\n", Age + 10);

	}
}
