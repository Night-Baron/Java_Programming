import java.util.Scanner;
public class temp{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int F_temp;
		System.out.println("화씨온도를 입력하시오:");
		F_temp = s.nextInt();
		System.out.println("섭씨 온도는 "+ ((F_temp -32) * 5 / 9.0) + "도 입니다.");
	}
}
