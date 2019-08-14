public class HW5_1{
	public static void main(String args[]){
		int num1=0, num2=0;
		if(args.length != 1){
			System.out.println("[입력오류]하나의 문자열을 입력하지 않아 프로그램을 종료합니다.");
			return;
		}
		
		for(int i=0;i<args[0].length();i++){
			if((args[0].charAt(i) >= 'A' && args[0].charAt(i) <= 'Z') || (args[0].charAt(i) >= 'a' && args[0].charAt(i) <= 'z')){
				switch(args[0].charAt(i)){
					case 'A':case 'E': case 'I': case 'O': case 'U':
					case 'a':case 'e': case 'i': case 'o': case 'u':
						num2++;
						break;
					default:
						num1++;		
				}
			}
		}
		System.out.printf("자음의 개수: %d\n", num1);
		System.out.printf("모음의 개수: %d\n", num2);
	}
}
