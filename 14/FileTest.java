import java.io.*;
import java.util.*;

class FileTest{
	public static void main(String args[]){
		File f1 = new File("test.java"); // "test 파일"에 대한 파일 객체 생성 (상대 경로)
		File f2 = new File("/home/nightbaron/java/14/test.java"); //(절대 경로)
		File f3 = new File("/home/nightbaron/java/14/test/ABC.java");
		File f4 = new File("ABC.java"); //실제로는 존재하지 않는다. 파일객체만 생성
		File f5 = new File("/home/nightbaron/java/14/test"+File.separator+"ABC.java");

		//exists() // 해당파일이 존재하는지 확인
		System.out.println("f1 파일이 실재로 존재:"+f1.exists());
		System.out.println("f4 파일이 실재로 존재:"+f4.exists());

		//getName() // 경로를 미포함, 파일 이름을 반환
		System.out.println("f2 파일 이름: "+f2.getName());
		System.out.println("f3 파일 이름: "+f3.getName());

		// exist와 getNmae 중요!!

		//legnth()
		System.out.println("f2 파일의 크기: "+f2.length()+"바이트");
		System.out.println("f3 파일의 크기: "+f3.length()+"바이트");

		//isAbsolute(), getAbsolutePath()
		System.out.println("f1 절대경로? "+ f1.isAbsolute());
		System.out.println("f2 절대경로? "+ f2.isAbsolute());
		System.out.println("f3 절대경로: "+f3.getAbsolutePath());

		System.out.println("f3의 최종 수정일: "+new Date(f3.lastModified()));
	}
}
