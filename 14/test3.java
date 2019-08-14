import java.io.*;
import java.util.*;

class test3{
	public static void main(String args[]) throws Exception{
		File f1 = new File("학생정보.txt");	
		
		if(!f1.exists()){
			System.out.print(f1.getName()+"이 존재하지 않아 종료\n");
			return;
		}
		
		Scanner s1 = new Scanner(f1);
		while(s1.hasNext()){
			System.out.printf("이름: %s, 나이: %d, 학점: %.1f\n", s1.next(), s1.nextInt(), s1.nextDouble());
		}
	}
}
