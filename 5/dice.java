import java.util.Scanner;
public class dice{
	public static void main(String args[]){
		int dice;
		Scanner s = new Scanner(System.in);

		System.out.print("dice: ");
		dice = s.nextInt();
		switch(dice){
			case 6:
				System.out.println("수");
				break;
			case 5:
				System.out.println("우");
				break;
			case 4:
				System.out.println("미");
				break;
			case 3:
				System.out.println("양");
				break;
			case 1: case 2:
				System.out.println("가");
				break;
			default:
				System.out.println("주사위 값이 아닙니다.");
		}
	}
}
