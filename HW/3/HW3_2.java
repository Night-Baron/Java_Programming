import java.util.Scanner;
//import java.lang.Math;

public class HW3_2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int cx1, cy1, cx2, cy2;
		int abs1, abs2;
		int check;
		double output1, output2, output3;
		System.out.printf("점 1의 x좌표: ");
		cx1 = s.nextInt();
		System.out.printf("점 1의 y좌표: ");
		cy1 = s.nextInt();
		System.out.printf("점 2의 x좌표: ");
		cx2 = s.nextInt();
		System.out.printf("점 2의 y좌표: ");
		cy2 = s.nextInt();
		
		if((cx1 == cx2) || (cy1 == cy2))
			check = 1;
		else
			check = 0;
		
			
		if(check == 1){
			System.out.println("직사각형이 아닙니다.");
			return;
		}else{
			//abs값 추출
			abs1 = cx1 - cx2;
			if (abs1 < 0)
				abs1 = -(abs1);
			abs2 = cy1 - cy2;
			if (abs2 < 0)
				abs2 = -(abs2);
			
			output1 = (abs1 + abs2) * 2;
			System.out.printf("둘레의 길이: %.2f\n", output1);
			output2 = Math.sqrt(Math.pow(abs1, 2) + Math.pow(abs2, 2));
			System.out.printf("대각선의 길이: %.2f\n", output2);
			output3 = abs1 * abs2;
			System.out.printf("넓이: %.2f\n", output3);
		}
	}
}
