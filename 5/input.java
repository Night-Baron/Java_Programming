import java.util.Scanner;
public class input{
	public static void main(String args[]){
		int num; int b;
		Scanner s = new Scanner(System.in);

		System.out.println("정수 입력: ");
		num = s.nextInt();
		if(num>0)
			b = 1;
		else if(num == 0)
			b = 0;
		else
			b = -1;
		System.out.println("b 초기화 완료");
		System.out.println("b == " +b);
	}
}
