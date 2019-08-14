import java.util.Scanner;
public class loop2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num; int [] ary;


		System.out.print("학생 수: ");
		num = s.nextInt();
		ary = new int [num];

		for(int i =0;i<ary.length;i++){
			System.out.printf("%d번 학생 점수: ", i+1);
			ary[i] = s.nextInt();
		}

		System.out.println("몇 번 학생??");
		num = s.nextInt();
		System.out.printf("%d번 학생 점수: %d\n", num,ary[num-1]);
	}
}
