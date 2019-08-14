//파일 복사 프로그램
/*
   1. 커맨드라인에서 원본파일, 복사본파일 입력받기: java CopyTest 원본파일 대체파일 구단어 신단어
   2. 커맨드라인에 입력 4개가 없다면 사용법 알리고 종료
   3. 원본파일이 존재하지 않으면 이를 알리고 종료
   4. 대체 파일이 이미 존재한다면 이를 알리고 종료
   5. 원본을 대체파일에 복사하고 콘솔창에 대체완료라고 띄울 것
*/
import java.util.*;
import java.io.*;

class ReplaceTest{
	public static void main(String args[]) throws Exception{
		//String s1 = "Hello world! Hello java!";
		//String s2 = s1.replaceAll("Hello","HELLO");//s1에서 Hello를 HELLO로 교체
		//System.out.println(s2);
		//substring(), length(), charAt() 등등 String 클래스 메소드
		//"1123"를 정수 1123으로 변경: Integer.parseInt("1123") => 1123


		if(args.length < 4){
			System.out.println("[Usage] java CopyTest 원본파일 대체파일 구단어 신단어");
			return;
		}
		File f1 = new File(args[0]);

		if(!f1.exists()){
			System.out.println("원본 파일이 존재하지 않습니다.");
			return;
		}
		File f2 = new File(args[1]);
		if(f2.exists()){
			System.out.println("대체 파일이 존재합니다.");
			return;
		}
		Scanner s = new Scanner(f1);
		PrintWriter pw = new PrintWriter(f2);

		while(s.hasNext())
			pw.println(s.nextLine().replaceAll(args[2], args[3]));	
		pw.close();
		s.close();
		System.out.println("파일 대체 완료!");
	}
}
