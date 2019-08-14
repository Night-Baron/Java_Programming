import java.util.Scanner;
public class switch2{
	public static void main(String args[]){
		String line;int number;
		Scanner s = new Scanner(System.in);
		System.out.print("몇 종:");
		line = s.nextLine();
		System.out.print("몇 점:");
		number = s.nextInt();
		switch(line){
			case "1종": case "1":
				if(number >= 70)
					System.out.println("합격");
				else
					System.out.println("불합격");
				break;
			case "2종": case "2":
				if(number >= 60)
					System.out.println("합격");
				else
					System.out.println("불합격");
				break;
			default:
				System.out.println("[오류]");
		}
	}
}
