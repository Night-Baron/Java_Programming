import java.util.Scanner;
public class date{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int Today = 5, date;
		System.out.println("오늘은 5요일 입니다.");
		System.out.println("\n며칠 후:");
		date = s.nextInt();

		System.out.println(date +"일 후는 "+((Today+date)%7) +"요일입니다.");
	}
}
