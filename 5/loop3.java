import java.util.Scanner;
public class loop3{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String s1;
		int num1, num2, temp;

		System.out.print("문자열: ");
		s1 = s.nextLine();

		System.out.print("a: ");
		num1 = s.nextInt();
		while(num1 <= 0 || num1 > s1.length()){
			System.out.println("[입력오류]a는 문자열의 길이보다 작은 양의 정수만 유효합니다.");
			System.out.print("a: ");
			num1 = s.nextInt();
		}
		System.out.print("b: ");
		num2 = s.nextInt();
		while(num2 <= 0 || num2 > s1.length()){
			System.out.println("[입력오류]b는 문자열의 길이보다 작은 양의 정수만 유효합니다.");
			System.out.print("b: ");
			num2 = s.nextInt();
		}
		// a가 b보다 클때
		if(num1 > num2){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}	
		
		System.out.printf("\"%s\"에서 %d번째부터 %d번째 문자까지 잘라낸 문자열은 \"%s\"입니다.\n",s1, num1, num2, s1.substring(num1-1, num2));
	}
}
