//파일 복사 프로그램
/*
   1. 커맨드라인에서 원본파일, 복사본파일 입력받기: java CopyTest 원본파일 복사본파일
   2. 커맨드라인에 입력 2개가 없다면 사용법 알리고 종료
   3. 원본파일이 존재하지 않으면 이를 알리고 종료
   4. 복사본 파일이 이미 존재한다면 이를 알리고 종료
   5. 원본을 복사본에 복사하고 콘솔창에 복사완료라고 띄울 것
*/
import java.util.*;
import java.io.*;

class CopyTest{
	public static void main(String args[]) throws Exception{
		if(args.length < 2){
			System.out.println("[Usage] java CopyTest 원본파일 복사본파일");
			return;
		}
		File f1 = new File(args[0]);

		if(!f1.exists()){
			System.out.println("원본 파일이 존재하지 않습니다.");
			return;
		}
		File f2 = new File(args[1]);
		if(f2.exists()){
			System.out.println("복사본 파일이 존재합니다.");
			return;
		}
		Scanner s1 = new Scanner(f1);
		PrintWriter pw = new PrintWriter(f2);
		
		while(s1.hasNext())
			pw.println(s1.nextLine());	
		pw.close();
		s1.close();
		System.out.println("파일 복사 완료!");
	}
}
