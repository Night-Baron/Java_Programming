import java.util.Scanner;
public class loop2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String s1;
	   	int x;

		System.out.print("문자열: ");
		s1 = s.nextLine();


		System.out.print("x: ");
		x = s.nextInt();
		while(x < 1 || x > s1.length()){
			System.out.println("[입력오류]x는 문자열의 길이보다 작은 양의 정수만 유효합니다.");
			System.out.print("x: ");
			x = s.nextInt();
		}
		System.out.println("문자열 \""+s1+"\"에서 "+x+"번째 문자는 \'"+ s1.charAt(x-1) +"\'입니다.");
	}
}
