public class HW5_1_2{
	public static void main(String args[]){
		char [] ary;
		if(args.length != 1){
			System.out.println("[입력오류]하나의 문자열을 입력하지 않아 프로그램을 종료합니다.");
			return;
		}
		ary = new char [args[0].length()];
		for(int i=0;i<args[0].length();i++){
			ary[i] = args[0].charAt(ary.length-i-1);
		}
		
		for(char x: ary)
			System.out.print(x);
		System.out.println();
	}
}
