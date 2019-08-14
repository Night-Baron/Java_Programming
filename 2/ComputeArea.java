import java.util.Scanner;

// java.lang.String
// java.lang.System
// java.lang.Math
// java.lang 패키지는 import 하지 않아도 사용가능하다.

public class ComputeArea{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		double radius, area, round;

		System.out.print("원의 반지름:");
		radius = s.nextDouble();
		
		area = Math.pow(radius, 2) * Math.PI;
		round = radius * 2 * 3.14;
		System.out.printf("넓이는 %.2f이고, 둘레는 %.2f입니다.\n", area, round);
		System.out.printf("루트 7: " + Math.sqrt(7));
		System.out.printf("\nsin(pi/2): "+ Math.sin(Math.PI / 2));
		System.out.printf("\ncos(0): " + Math.cos(0));
		System.out.printf("\nsin(pi): %.4f", Math.sin(Math.PI));
	}
}
