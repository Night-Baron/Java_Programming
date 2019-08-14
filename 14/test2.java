//1. 사용자로부터 이름, 나이, 학점을 입력받아 입력받은 정보 그대로 출력하기
/*
import java.util.*;

class test2{
	public static void main(String args[]){
		Scanner s1 = new Scanner(System.in);	//키보드로부터 자료를 읽어오겠다.
		String name; int age; double score;


		System.out.printf("이름: ");
		name = s1.nextLine();
		System.out.printf("나이: ");
		age = s1.nextInt();
		System.out.printf("학점: ");
		score = s1.nextDouble();


		System.out.printf("이름: %s\n", name);
		System.out.printf("나이: %d\n", age);
		System.out.printf("학점: %.1f\n", score);
		//모니터에 printf()하겠다.
	}
}
*/

//2. 사용자로부터 이름, 나이, 학점을 입력받아 입력받은 정보 학생정보.txt에 출력하기

import java.util.*;
import java.io.*;
class test2{
	public static void main(String args[]) throws Exception {
		Scanner s1 = new Scanner(System.in);
		File f1 = new File("학생정보.txt");
		PrintWriter pw = new PrintWriter(f1); //f1("학생정보.txt")에 출력스트림을 연결

		int age;String name;double score;
		System.out.println(f1.exists());


		System.out.print("이름: ");
		name = s1.nextLine();
		System.out.print("나이: ");
		age = s1.nextInt();
		System.out.print("학점: ");
		score = s1.nextDouble();

		pw.printf("경규진 5 1.2\n");
		pw.printf("%s %d %.1f\n", name, age, score);
		pw.close();
		System.out.println("파일에 출력을 완료하였습니다.\n");

	}
}
