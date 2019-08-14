public class HW5_1_2{
	public static void main(String args[]){
		if(args.length != 1){
			System.out.println("[입력 오류]하나의 문자열을 입력하지 않아 프로그램을 종료합니다.");
			return;
		}
		
		System.out.println("역순 문자열: ");
		for(int i = args[0].length()-1;i>=0;i--)
			System.out.print(args[0].charAt(i));
		System.out.println();
	}
}
