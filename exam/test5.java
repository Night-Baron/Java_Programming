import java.util.Scanner;
public class test5{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String state; int num1, num2, temp;

		System.out.printf("문자열: ");
		state = s.nextLine();
		System.out.print("a: ");
		num1 = s.nextInt();
		while (num1 < 1 || num1 > state.length()){
			System.out.println("[입력오류] a는 문자열의 길이보다 작은 양의 정수만 유효합니다.");
			System.out.print("a: ");
			num1 = s.nextInt();
		}
		System.out.printf("b: ");
		num2 = s.nextInt();
		while (num2 < 1 || num2 > state.length()){
			System.out.println("[입력오류] b는 문자열의 길이보다 작은 양의 정수만 유효합니다.");
			System.out.print("b: ");
			num2 = s.nextInt();
		}
		if(num1 >= num2){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.printf("\"%s\"에서 %d번째부터 %d번째 문자까지 잘라낸 문자열은 \"", state, num1, num2);
		for(int i=num1-1; i<num2; i++)
			System.out.print(state.charAt(i));
		System.out.printf("\"입니다.\n");
	}
}	
