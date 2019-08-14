import java.util.Scanner;
public class num2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num; int [] S;
		
		System.out.print("학생 수: ");
		S = new int [s.nextInt()];

		for(int i=0;i<S.length;i++){
			System.out.printf("%d번 학생 점수: ", i+1);
			S[i] = s.nextInt();
		}
		while(true){
			System.out.print("몇 번 학생? => ");
			num = s.nextInt();
			while(num < 1 || num > S.length){
				System.out.printf("1에서 %d번 학생만 존재합니다.\n", S.length);
				System.out.print("몇 번 학생? =>");
				num = s.nextInt();
			}
			System.out.printf("%d번 학생 점수: %d\n\n\n", num,S[num-1]);
		}
	}
}
