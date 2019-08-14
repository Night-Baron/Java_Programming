import java.util.Scanner;
public class Name{
	public static void main(String[] args){
		int age;
		String name;
		Scanner myScanner = new Scanner(System.in);
		System.out.print("나이: ");
		age = myScanner.nextInt();
		
		myScanner.nextLine(); //버퍼에서 엔터가 제거됨
		//next(), nextInt(), nextDouble(), 등을 사용하다가 nextLine()을 사용하는 경우에만 버퍼 비워줄것
		System.out.print("이름: ");
		name = myScanner.nextLine(); //한 라인을 통째로 입력으로 간
		System.out.println("당신의 이름은 \"" + name + "\"입니다.");
	}
}
