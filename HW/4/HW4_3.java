import java.util.Scanner;
public class HW4_3{
	public static void main(String args[]){
		String type; int line, num, check, line1, line2;
		Scanner s = new Scanner(System.in);
		check = 0;


		System.out.print("도형의 타입: ");
		type = s.next();
		if(type.equals("피라미드"))
			check++;
		if(type.equals("사각형"))
			check++;
		if(type.equals("다이아몬드"))
			check++;
		while(check==0){
			System.out.println("[입력오류]도형의 타입은 피라미드, 사각형, 다이아몬드만 가능합니다. 다시입력해주세요.");
			Syste.out.print("도형의 타입: ");
			type = s.next();
			if(type.equals("피라미드"))
				check++;
			if(type.equals("사각형");
				check++;
			if(type.equals("다이아몬드"))
				check++;
		}
		Swtich(type){
			case "피라미드":
				System.out.print("라인 수: ");
				line = s.nextInt();
				if(line > 10 || line < 1){
					System.out.println("[입력오류]피라미드의 라인수는 10이하의 양의 정수만 가능합니다. 다시입력해주세요.");
					System.out.print("라인 수: ");
					line = s.nextInt();
				}
				break;
			case "사각형":
				System.out.print("가로: ");
				line1 = s.nextInt();
				if(line1 < 1){
					System.out.println("[입력오류]사각형의 가로는 양의 정수만 가능합니다. 다시 입력해주세요.");
					System.out.print("가로: ");
					line1 = s.nextInt();
				}
				System.out.print("세로: ");
				if(line2 < 1){
					System.out.println("[입력오류]사각형의 세로는 양의 정수만 가능합니다. 다시 입력해주세요.");
					System.out.print("세로: ");
					line2 = s.nextInt();
				}
				break;

				if(
			case "다이아몬드":
				System.out.print("라인 수: ");
				line = s.nextInt();
				if(line <1 || line % 2 == 0){
					System.out.println("[입력오류]다이아몬드의 라인 수는 양의 홀수만 가능합니다. 다시 입력해주세요.");
					System.out.print("라인 수: ");
					line = s.nextInt();
				}
				break;
		}
	}
}		
