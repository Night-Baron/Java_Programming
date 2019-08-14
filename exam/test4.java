import java.util.Scanner;
public class test4{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String state; int num;
	
		System.out.print("문자열: ");
		state = s.nextLine();
		System.out.print("x: ");
		num = s.nextInt();
		while(num < 1 || num > state.length()){
			System.out.println("[입력오류]x는 문자열의 길이보다 작은 양의 정수만 유효합니다.");
			System.out.print("x: ");
			num = s.nextInt();
		}
		System.out.printf("문자열 \"%s\"에서 %d번째 문자는 \'%s\'입니다.", state, num, state.charAt(num-1));
	}
}
