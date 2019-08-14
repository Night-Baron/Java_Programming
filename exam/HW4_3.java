import java.util.Scanner;
public class HW4_3{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String type; int line, line2, retry, temp;

		System.out.print("도형의 타입: ");
		type = s.next();
		
		while(type.equals("피라미드") == false && type.equals("사각형") == false && type.equals("다이아몬드") == false){
			System.out.println("[입력오류]도형의 타입은 피라미드, 사각형, 다이아몬드만 가능합니다. 다시 입력해주세요.");
			System.out.print("도형의 타입: ");
			type = s.nextLine();
		}

		switch(type){
			case "피라미드":
				System.out.print("라인 수: ");
				line = s.nextInt();
				while(line < 1 || 10 < line){
					System.out.println("[입력오류]피라미드의 라인수는 10이하의 양의 정수만 가능합니다. 다시 입력해주세요.");
					System.out.print("라인 수: ");
					line = s.nextInt();
				}
				for(int i=0;i<line;i++){
					for(int j=0;j<5-i;j++)
						System.out.print(" ");
					temp = i;
					for(int j=0;j<i+1;j++){
						System.out.print(temp);
						temp--;
					}
					temp+=2;
					for(int j=0;j<i;j++){
						System.out.print(temp);
						temp++;
					}
					System.out.println("");
				}
				break;
				
			case "사각형":
				System.out.print("가로: ");
				line = s.nextInt();
				if(line < 1){
					System.out.println("[입력오류]사각형의 가로는 양의 정수만 가능합니다. 다시 입력해주세요.");
					System.out.print("가로: ");
					line = s.nextInt();
				}
				System.out.print("세로: ");
				line2 = s.nextInt();
				if(line2 < 1){
					System.out.println("[입력오류]사각형의 세로는 양의 정수만 가능합니다. 다시 입력해주세요.");
					System.out.print("세로: ");
					line2 = s.nextInt();
				}
				System.out.print("반복 횟수: ");
				retry = s.nextInt();
				if(retry < 1){
					System.out.println("[입력오류]반복 횟수는 양의 정수만 가능합니다. 다시 입력해주세요.");
					System.out.print("반복 횟수: ");
					retry = s.nextInt();
				}
				for(int k=0;k<line2;k++){
					for(int j=0;j<retry;j++){
						for(int i=0;i<line;i++)
							System.out.print("*");
						System.out.print(" ");
					}
					System.out.println("");
				}
				break;

				case "다이아몬드":
					System.out.print("라인 수: ");
					line = s.nextInt();
					while(line % 2 == 0){
						System.out.println("[입력오류]다이아몬드의 라인 수는 양의 홀수만 가능합니다. 다시 입력해주세요.");
						System.out.print("라인 수: ");
						line = s.nextInt();
					}

					for(int i=0;i<(line-1)/2+1;i++){
						for(int j=0;j<3-i;j++)
							System.out.print(" ");
						for(int j=0;j<2*(i+1)-1;j++)
							System.out.print("*");
						System.out.println("");
					}

					for(int i=(line-1)/2-1;i>=0;i--){
						for(int j=0;j<3-i;j++)
							System.out.print(" ");
						for(int j=0;j<2*(i+1)-1;j++)
							System.out.print("*");
						System.out.println("");
					}
					break;
		}
	}
}
