import java.util.Scanner;
public class HW5_1_1{
	public static void main(String args[]){
		int num1 = 0, num2 = 0;
		String word;
		if(args.length != 1){
			System.out.println("[입력오류]하나의 문자열을 입력하지 않아 프로그램을 종료합니다.");
			return;
		}

		word = args[0];
		for(int i=0;i<word.length();i++){
			if((word.charAt(i) >= 'a' && word.charAt(i) <= 'z') || (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')){
					switch(word.charAt(i)){
						case 'a':case 'e':case 'i':case 'o':case 'u':
						case 'A':case 'E':case 'I':case 'O':case 'U':
							num1++;
							break;
						default:
							num2++;
							break;
					}
			}
		}
		System.out.printf("자음의 개수: %d\n", num2);
		System.out.printf("모음의 개수: %d\n", num1);
	}
}
