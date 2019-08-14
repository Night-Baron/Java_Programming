import java.util.Scanner;
public class HW3_2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		double ax, ay, bx, by;
		double abs1, abs2;
		System.out.print("점1의 x좌표: ");
		ax = s.nextInt();
		System.out.print("점1의 y좌표: ");
		ay = s.nextInt();
		System.out.print("점2의 x좌표: ");
		bx = s.nextInt();
		System.out.print("점2의 y좌표: ");
		by = s.nextInt();
		
		abs1 = ax - bx;
		abs2 = ay - by;

		if(abs1 < 0)
			abs1 = -abs1;
		else if(abs1 == 0){
			System.out.println("직사각형이 아닙니다.");
			return;
		}

		if(abs2 < 0)	
			abs2 = -abs2;
		else if(abs2 == 0){
			System.out.println("직사각형이 아닙니다.");
			return;
		}

		System.out.printf("둘레의 길이: %.2f\n", 2*abs1 + 2*abs2);
		System.out.printf("대각선의 길이: %.2f\n", Math.sqrt(Math.pow(abs1,2) + Math.pow(abs2, 2)));
		System.out.printf("넓이: %.2f\n", abs1 * abs2);
	}
}
