import java.util.Scanner;
public class exam4{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String line = ""; int line2, cnt =0;

		while(true){
			System.out.print("몇 라인: ");
			line = s.nextLine();
			if(line.equals("quit")){
				System.out.println("프로그램을 종료합니다.");
				System.out.printf("총 %d번의 패턴을 출력하셨습니다.\n", cnt);
				return;
			}
			line2 = Integer.parseInt(line);
			while(line2 < 3 || line2 % 2 == 0){
				System.out.println("[입력오류]라인은 3이상의 홀수로만 입력해주세요.");
				System.out.print("몇 라인: ");
				line = s.nextLine();
				if(line.equals("quit")){
					System.out.println("프로그램을 종료합니다.");
					System.out.printf("총 %d번의 패턴을 출력하셨습니다.\n", cnt);
					return;
				}
				line2 = Integer.parseInt(line);
			}
			for(int i=0;i<(line2+1)/2;i++){
				for(int j=(line2-1)-2*i;j>0;j--) System.out.print(" ");
				for(int j=0;j<i*4+1;j++) System.out.print("*");
				System.out.println();
			}
			for(int i=(line2-3)/2;i>=0;i--){
				for(int j=0;j<(line2-1)-2*i;j++) System.out.print(" ");
				for(int j=i*4;j>=0;j--) System.out.print("*");
				System.out.println();
			}	
			cnt++;
		}
	}
}
