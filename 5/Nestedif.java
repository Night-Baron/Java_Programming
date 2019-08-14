import java.util.Scanner;

public class Nestedif{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num; String line;
			
		System.out.print("몇 종: ");
		line = s.nextLine();
		System.out.print("몇 점: ");
		num = s.nextInt();
		
		if(line.equals("1종")){
			if(num >= 70)
				System.out.println("합격");
			else
				System.out.println("불합격");
		}else if("2종".equals(line)){
			if(num >= 60)
				System.out.println("합격");
			else
				System.out.println("불합격");
		}else{
			System.out.println("[오류]");
		}
	}
}
